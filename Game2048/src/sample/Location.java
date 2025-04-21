package sample;

public class Location {
    private final int x;
    private final int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Location offset(Direction direction) {
        return new Location(x + direction.getX(), y + direction.getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Location{ x=" + x + " , y=" + y + "}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.x;
        hash = 97 * hash + y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Location other = (Location) obj;
        if (x != other.x)
            return false;
        return this.y == other.y;
    }

    public double getLayoutY(int cellSize) {

        return (y * cellSize) + (cellSize / 2);
    }

    public double getLayoutX(int cellSize) {
        return (x * cellSize) + (cellSize / 2);
    }

//    public boolean isValidFor(int gridSize) {
//        return x >= 0 && x < gridSize && y > 0 && y < gridSize && y >= 0;
//    }
}
