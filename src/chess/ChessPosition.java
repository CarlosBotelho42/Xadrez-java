package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char colum;
	private int row;
	
	
	public ChessPosition(char colum, int row) {
		if (colum < 'a' || colum > 'h' || row < 1 || row > 8) {
			throw new ChessException("Erro ao instanciar o ChessPosition. os valos são de a1 ate h8");
			
		}
		
		this.colum = colum;
		this.row = row;
	}


	public int getColum() {
		return colum;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, colum - 'a');
		
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColum()), 8 - position.getRow());
		
	}
	
	@Override
	public String toString() {
		return "" + colum + row;
		
	}

}
