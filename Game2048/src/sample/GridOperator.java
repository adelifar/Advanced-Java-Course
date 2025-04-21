package sample;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GridOperator {
    public static final int DEFAULT_GRID_SIZE = 4;
    private final int gridSize;
    private final List<Integer> traversalX;
    private final List<Integer> traversalY;
    public GridOperator(){
        this(DEFAULT_GRID_SIZE);
    }
    public GridOperator(int gridSize){
        this.gridSize=gridSize;
        this.traversalX = IntStream.range(0,gridSize).boxed().collect(Collectors.toList());
        this.traversalY=IntStream.range(0,gridSize).boxed().collect(Collectors.toList());
    }
    public void sortGrid(Direction direction){
        Collections.sort(traversalX,direction.equals(Direction.RIGHT)?Collections.reverseOrder():Integer::compareTo);
        Collections.sort(traversalY,direction.equals(Direction.DOWN)?Collections.reverseOrder():Integer::compareTo);
    }

    //traverse tx, ty and run func in it. this traverse add func return for each pair and return it
    public int traverseGrid(IntBinaryOperator func){
        AtomicInteger at=new AtomicInteger();
        traversalX.forEach(tx->{
            traversalY.forEach(ty->{
                at.addAndGet(func.applyAsInt(tx,ty));
            });
        });
        return at.get();
    }

    public int getGridSize() {
        return gridSize;
    }
    public boolean isValidLocation(Location location){
        return location.getX()>=0&& location.getX()<gridSize && location.getY()>=0 && location.getY()<gridSize;
    }
}
