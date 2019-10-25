package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Piao extends ChessPiece  {

	public Piao(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		return "P";
		
	}

}
