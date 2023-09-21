package application;

import chess.ChessMatch;

public class Program {

	public void exec() {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}