package application;

import chess.ChassPartida;

public class Program {

	public static void main(String[] args) {
		
		ChassPartida partidaxadrez = new ChassPartida();
		
		UI.printBoard(partidaxadrez.getPieces());

	}

}
