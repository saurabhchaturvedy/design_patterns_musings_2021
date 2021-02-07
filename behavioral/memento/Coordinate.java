public class Coordinate {

    int x;
    int y;

    public void displayCoordinates() {
        System.out.println("coordinates are " + x + " and " + y);
    }


    public CoordinateMemento createMemento() {
        return new CoordinateMemento(this.x, this.y);
    }

    public void setMemento(CoordinateMemento coordinateMemento) {
        this.x = coordinateMemento.getX();
        this.y = coordinateMemento.getY();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
