package boardgame;

public class Board {
	
	private int rows;
	private int colums;
	private Piece [][] pieces;
	
	public Board(int rows, int colums) {
		if (rows < 1 || colums < 1 ) {
			throw new BoardException("Erro ao criar tabuleiro: É necessario que "
									+ "exista pelo menos uma linha e uma coluna!");
			
		}
		
		this.rows = rows;
		this.colums = colums;
		
		pieces = new Piece[rows][colums];
	}

	public int getRows() {
		return rows;
	}

	public int getColums() {
		return colums;
	}

	public Piece piece(int row, int colum) {
		if(!positionExists(row, colum)) {
			throw new BoardException("A posição não existe no tabuleiro!");
		}
		
		return pieces[row][colum];
		
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("A posição não existe no tabuleiro!");
		}
		
		return pieces [position.getRow()][position.getColum()];
		
	}
	
	public void placePiece(Piece piece, Position position) {
		if(temumaPiece(position)) {
			throw new BoardException("Já existe uma peça na posição " + position);
		}
		
		pieces[position.getRow()][position.getColum()] = piece;
		piece.position = position;
		
	}
	
	public boolean positionExists(int row, int colum) {
		return row >= 0 && row < rows && colum >= 0 && colum < colums;
		
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColum());
	}
	
	public boolean temumaPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Já existe uma peça na posição " + position);
		}		
		
		return piece (position) != null;
	}

}
