package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rei;
import chess.pieces.Torre;

public class ChassPartida {

	private Board board;
	
	public ChassPartida(){
		board = new Board(8, 8);
		initialSetup();
		
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()];
		
		for(int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColums(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
		
	}
	
	private void initialSetup() {
		board.placePiece(new Torre(board, Color.WHITE), new Position(0, 0));
		board.placePiece(new Torre(board, Color.BLACK), new Position(7, 0));
		board.placePiece(new Rei(board, Color.WHITE), new Position(0, 4));
		board.placePiece(new Rei(board, Color.BLACK), new Position(7, 4));
	}
	
}
