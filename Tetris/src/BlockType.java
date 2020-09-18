package de.lukasimon.tetris;



import java.util.concurrent.ThreadLocalRandom;

public enum BlockType {
	I,O,T,L,J,Z,S;
	
	public static BlockType random() {
		
		return values()[ThreadLocalRandom.current().nextInt(0,values().length)];			//Es gibt Blocktypen, die zufällig generiert werden 
	}
}

