package actions;

import game.Direction;
import game.Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W: //Nach oben
                //Geht nur, wenn Snake sich nicht nach unten bewegt (entgegengesetzter Richtung)
                if(!(Snake.head.getDir() == Direction.DOWN) && !Snake.waitToMove){
                    Snake.head.setDir(Direction.UP);
                    Snake.waitToMove = true; //Sonst könnte man instant Direction wechseln
                }
                break;
            case KeyEvent.VK_A: //Nach links
                if(!(Snake.head.getDir() == Direction.RIGHT) && !Snake.waitToMove){
                    Snake.head.setDir(Direction.LEFT);
                    Snake.waitToMove = true;
                }
                break;
            case KeyEvent.VK_S: //Nach unten
                if(!(Snake.head.getDir() == Direction.UP) && !Snake.waitToMove){
                    Snake.head.setDir(Direction.DOWN);
                    Snake.waitToMove = true;
                }
                break;
            case KeyEvent.VK_D: //Nach rechts
                if(!(Snake.head.getDir() == Direction.LEFT) && !Snake.waitToMove){
                    Snake.head.setDir(Direction.RIGHT);
                    Snake.waitToMove = true;
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
