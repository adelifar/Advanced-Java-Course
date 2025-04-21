package sample;

import javafx.beans.property.StringProperty;

import java.io.*;
import java.util.Map;
import java.util.Properties;

public class SessionManager {
    public final String SESSION_PROPERTIES_FILENAME;
    private final Properties props = new Properties();
    private final GridOperator gridOperator;

    public SessionManager(GridOperator gridOperator) {
        this.gridOperator = gridOperator;
        this.SESSION_PROPERTIES_FILENAME = "game2048_" + gridOperator.getGridSize() + ".properties";
    }

    public void saveSession(Map<Location, Tile> gameGrid, Integer score, long time) {
        gridOperator.traverseGrid((x, y) -> {
            Tile tile=gameGrid.get(new Location(x,y));
            props.setProperty("location_"+x+"_"+y,tile!=null?tile.getValue().toString():"0");
            return 0;
        });
        props.setProperty("score",score.toString());
        props.setProperty("time", String.valueOf(time));
        try {
            props.store(new FileWriter(SESSION_PROPERTIES_FILENAME),SESSION_PROPERTIES_FILENAME);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public int restoreSession(Map<Location, Tile> gameGrid, StringProperty time, Board board) {
        //todo optimize using props
        Reader reader=null;
        try {
            reader=new FileReader(SESSION_PROPERTIES_FILENAME);
            props.load(reader);
        } catch (FileNotFoundException e) {
            return -1;
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        finally {
            if (reader!=null) {
                try {
                    reader.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }
        gridOperator.traverseGrid((x, y) -> {
            final String val = props.getProperty("location_" + x + "_" + y);
            if (!val.equals("0")){
                Tile tile=Tile.newTile(Integer.parseInt(val));
                final Location location = new Location(x, y);
                tile.setLocation(location);
                gameGrid.put(location,tile);
                board.addTile(tile);
            }
            return 0;
        });
        time.set(props.getProperty("time"));
        final String score = props.getProperty("score");
        if (score!=null)return Integer.parseInt(score);
        return 0;
    }
}
