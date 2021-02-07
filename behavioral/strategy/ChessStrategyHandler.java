public class ChessStrategyHandler {

    ChessAlgorithm chessAlgorithm = new EasyChessAlgorithm();

    String makeNextMove() {
        return chessAlgorithm.makeNextMove();
    }

    public void setChessAlgorithm(ChessAlgorithm chessAlgorithm) {
        this.chessAlgorithm = chessAlgorithm;
    }

}
