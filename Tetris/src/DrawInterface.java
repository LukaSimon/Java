package de.lukasimon.tetris;



import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;


public class DrawInterface extends JLabel{																				
	@Override
	protected void paintComponent(Graphics g) {																		//Die Graphics Klasse wird aufgerufen und initialisiert
		super.paintComponent(g);
		
		g.setColor(Game.nextBlock.getColor());																		//Die Grafikkomponente bekommt eine Farbe (je nach Block unterschiedlich)
		for (int j = 0; j < Game.nextBlock.getBounds()[Game.nextBlock.getRotation()].length; j++) {					//
			for (int k = 0; k < Game.nextBlock.getBounds()[Game.nextBlock.getRotation()][j].length; k++) {

				if (Game.nextBlock.getBounds()[Game.nextBlock.getRotation()][j][k] == 1) {
					g.fillRect(Conversion.cellToCoord(1 + j),
							Conversion.cellToCoord(k), 32, 32);
				}
			}
		}
		
		
		g.setColor(Color.LIGHT_GRAY);																				//Die Grafikkomponente bekommt eine Farbe (das Grid)
		for (int i = 0; i < 4; i++) {																				//Das Raster wird erzeugt
			for (int j = 0; j < 4; j++) {																			//
				g.drawRect(i*32 +32, j*32, 32, 32);																	//und wird durch Kästchen dargestellt 
			}
		}
	
		g.setColor(Color.BLACK);																					//Das Vorschaukästchen bekommt eine schwarze Umrandung 
		g.drawRect(32, 0,128, 128);																					//
		
		g.setFont(Gui.pixelfont);																					//
		g.drawString("SCORE: " + Game.score, 32, 200);																//Der Score wird angezeigt
		
		g.drawString("BEST: " + Game.highscore, 32, 250);															//Der beste Score wird angezeigt
		
		repaint();																									//Das Fenster wird neu gezeichnet
	}

}

