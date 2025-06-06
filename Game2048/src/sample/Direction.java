package sample;

import javafx.scene.input.KeyCode;

public enum Direction {
    UP(0,-1),RIGHT(1,0),DOWN(0,1),LEFT(-1,0);
    private final int x;
    private final int y;

     Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Direction{"+"y="+y+" , x= "+x+"}"+name();
    }
    public static Direction valueFor(KeyCode keycode){
        return valueOf(keycode.name());
    }
}
