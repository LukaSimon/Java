package de.lukasimon.tetris;



import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (Game.gamestate == GameState.start) {														//Den Tasten werden Funktionen zugewiesen. Beispielsweise den Block drehen
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				Game.gamestate = GameState.ingame;

			}
		}

		if (Game.gamestate == GameState.ingame) {
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				try {
					if (!Collision.collideInRotation(Game.currentBlock)) {
						Game.currentBlock.rotate();
					}
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}

			}

			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				Game.speedup = true;
			}

			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

				try {
					if (!Collision.collideWithWall(Game.currentBlock, 1)
							&& !Collision.collideWithBlock(Game.currentBlock, 1)) {
						Game.currentBlock.setX(Game.currentBlock.getX() + 1);
					} 
				} catch (Exception e2) {
					e2.printStackTrace();
					
				}
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				try {
					if (!Collision.collideWithWall(Game.currentBlock, -1)
							&& !Collision.collideWithBlock(Game.currentBlock, -1)) {
						Game.currentBlock.setX(Game.currentBlock.getX() - 1);
					} 
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				Game.gamestate = GameState.pause;

			}
		} else if (Game.gamestate == GameState.pause) {
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				Game.gamestate = GameState.ingame;
			}

		} else if (Game.gamestate == GameState.gameover) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				Game.gamestate = GameState.ingame;
				Game.clear();
			}

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {																				//Auch ein SpeedUp ist enthalten
		if (Game.gamestate == GameState.ingame) {
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				Game.speedup = false;
			}
		}

	}

}

