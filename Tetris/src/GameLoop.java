package de.lukasimon.tetris;

public class GameLoop extends Thread {
	private boolean running = true;

	@Override
	public void run() {
		while (running) {
			try {
				if (Game.gamestate == GameState.ingame) {
					
					if (!Collision.collideWithWall(Game.currentBlock, 0)
							&& !Collision.collideWithBlock(Game.currentBlock, 0)) {						//Wenn der Block an nichts anstößt, fällt er einen Platz nach unten  
						Game.currentBlock.setY(Game.currentBlock.getY() + 1);
						Collision.collideWithWall(Game.currentBlock, 0);

					}

					if (Game.spawnNewBlock) {
						Collision.checkFullRow(1);
						Game.blocks.add(Game.nextBlock);												//Es werden neue Blöck eingefügt  
						Game.currentBlock = Game.nextBlock;
						Game.nextBlock = new Block();
						Game.spawnNewBlock = false;
					}
				}
				if (!Game.speedup) {																	//Das Spiel wird schneller gemacht
					sleep(1000);
				} else {
					sleep(100);																			//oder es bleibt gleich schnell
				}

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}

