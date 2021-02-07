public class CoordinateApp {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        CoordinateCaretaker coordinateCaretaker = new CoordinateCaretaker();

        System.out.println("current state...");
        coordinate.setX(5);
        coordinate.setY(8);

        coordinate.displayCoordinates();

        coordinateCaretaker.saveState(coordinate);

        coordinate.setX(4);
        coordinate.setY(2);
        System.out.println("updated state...");
        coordinate.displayCoordinates();

        System.out.println("undo the coordinate change...take me to previous state");
        coordinateCaretaker.restoreState(coordinate);

        coordinate.displayCoordinates();
    }
}
