public class ChessApp {

    public static void main(String[] args) {
        ChessApp chessApp = new ChessApp();
        ChessStrategyHandler chessStrategyHandler = new ChessStrategyHandler();
        System.out.println(chessStrategyHandler.makeNextMove());
        ChessAlgorithm chessAlgorithm = new MediumChessAlgorithm();
        chessStrategyHandler.setChessAlgorithm(chessAlgorithm);
        System.out.println(chessStrategyHandler.makeNextMove());
        chessAlgorithm = new HardChessAlgorithm();
        System.out.println(chessStrategyHandler.makeNextMove());

    }
}
