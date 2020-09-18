package de.lukasimon.tetris;



import java.awt.FontFormatException;
import java.io.IOException;

public class Main {
	


	public static void main(String[] args) {
		
		DataHandler.load();																	//Der DataHandler wird aufgerufen
	
		Game.currentBlock = new Block();													//Es werden neue Blöcke hinzugefügt  
		Game.blocks.add(Game.currentBlock);													//
		Game.nextBlock = new Block();														//
		
		try {
			Gui g = new Gui();																//Es wird ein Gui erstellt(beziehungsweise aufgerufen)
			g.create();
		} catch (FontFormatException | IOException e) {
			System.out.println("Failed to create GUI.");									//Sonst wird ein Fehler ausgegeben
			e.printStackTrace();
		}
		
		startLoop();																		//Eine Schleife wird gestartet
		
	}
	
	public static void startLoop() {														//Die Schleife lässt das Spiel durchlaufen  
		GameLoop loop = new GameLoop();
		loop.start();
	}

}

