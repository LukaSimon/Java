package de.lukasimon.tetris;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;


public class DataHandler {
	
	
	public static void load() {																	//Die Datei mit den Inhalten beispielsweise bester Score werden ausgelesen
		File file = new File("rsc/data/save.txt");
		
		try {
			Scanner sc = new Scanner(file);
			Game.highscore = sc.nextInt();
			sc.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void save() {																	//Die Datei mit den Inhalten beispielsweise bester Score werden befüllt 
		File file = new File("rsc/data/save.txt");
		
		try {
			OutputStream stream = new FileOutputStream(file);
			try {
				stream.write(Integer.toString(Game.highscore).getBytes());
				stream.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}

