package de.lukasimon.tetris;



import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui {

	public static int width = 320, height = 576;																			//Es werden Variablen für die Höhe und Breite erstellt
	JFrame jf;																												//Ein Objekt der Klasse JFrame wird erstellt
	
	public static Font pixelfont;																							//Eine eigene Schriftart wird festgelegt

	public void create() throws FontFormatException, IOException {

		jf = new JFrame("Tetris");																							//Der JFrame wird definiert
		jf.setSize(width + 17 + 200, height + 41); 																			//Das Format wird festgelegt
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);																	//Das Fenster schließt sich mit dem X 
		jf.setLocationRelativeTo(null);                   																	//Das Fenster hat keinen "Bezugspunkt"
		jf.setResizable(false);																								//Das Fenster lässt sich nicht vergrößern/verkleinern
		jf.setLayout(null);
		jf.addKeyListener(new KeyHandler());																				//Die Tasteneingaben werden hinzugefügt(der KeyListener) 
		jf.requestFocus();
		
		pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("rsc/fonts/FFFFORWA.TTF")).deriveFont(12f);				//Die Schriftart wird definiert


		DrawMenu dm = new DrawMenu();																						//Ein Objekt der Klasse DrawMenu wird erstellt und definiert
		setupDraw(dm, 0, 0, width +200, height);																			//Dem DrawMenu Objekt wird gesagt, wo es zeichnen soll
		
		DrawGame dg = new DrawGame();																						//Ein Objekt der Klasse DrawGame wird erstellt und definiert
		setupDraw(dg, 0, 1, width + 1, height + 1);																			//Dem Drawgame Objekt wird gesagt, wo es zeichnen soll

		DrawInterface di = new DrawInterface();																				//Ein Objekt der Klasse DrawInterface wird erstellt und definiert
		setupDraw(di, width + 1, 1, width, height);																			//Dem DrawInterface Objekt wird gesagt, wo es zeichnen soll
		

		jf.setVisible(true);																								//Der JFrame ist sichtbar
	

	}

	private void setupDraw(JLabel draw, int x, int y, int width, int height) {												//Die Methode setupDraw wird erstellt und ihr werden Parameter übergeben
		draw.setBounds(x, y, width, height);																				//Die Grenzen werden festgelegt
		draw.setVisible(true);																								//Das Gezeichnete wird sichtbar
		jf.add(draw);																										//Das Gezeichnete wird dem JFrame hinzugefügt 
	}

}

