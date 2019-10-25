package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Cavalo;
import chess.pieces.Rainha;
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
	
	private void lugarNovapeca(char colum, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(colum, row).toPosition());
		
	}
	
	private void initialSetup() {
		lugarNovapeca('a', 8, new Torre(board, Color.WHITE));
		lugarNovapeca('h', 8, new Torre(board, Color.WHITE));
		lugarNovapeca('a', 1, new Torre(board, Color.BLACK));
		lugarNovapeca('h', 1, new Torre(board, Color.BLACK));
		/*board.placePiece(new Torre(board, Color.BLACK), new Position(7, 0));
		board.placePiece(new Torre(board, Color.WHITE), new Position(7, 7));
		board.placePiece(new Torre(board, Color.BLACK), new Position(0, 7));
		board.placePiece(new Rei(board, Color.WHITE), new Position(0, 4));
		board.placePiece(new Rei(board, Color.BLACK), new Position(7, 4));
		board.placePiece(new Rainha(board, Color.WHITE), new Position(0, 3));
		board.placePiece(new Rainha(board, Color.WHITE), new Position(7, 3));
		board.placePiece(new Cavalo(board, Color.WHITE), new Position(0, 1));
		board.placePiece(new Cavalo(board, Color.BLACK), new Position(7, 1));
		board.placePiece(new Cavalo(board, Color.WHITE), new Position(0, 6));
		board.placePiece(new Cavalo(board, Color.BLACK), new Position(7, 6));*/
		
		
	}
	
}
