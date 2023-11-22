package Application;

import chess.ChessMatch;

public class system {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard((chessMatch.getpieces()));
	}

}
