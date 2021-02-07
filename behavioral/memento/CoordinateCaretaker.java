public class CoordinateCaretaker {

    CoordinateMemento coordinateMemento;

    public void saveState(Coordinate coordinate) {
        coordinateMemento = coordinate.createMemento();
    }

    public void restoreState(Coordinate coordinate) {
        coordinate.setMemento(coordinateMemento);
    }
}
