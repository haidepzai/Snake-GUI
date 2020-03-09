package clocks;

import actions.Collision;
import game.Snake;

public class GameClock extends Thread {
    public static boolean running = true;
    public static int speed = 200;

    public void run(){
        while(running){
            try {
                sleep(speed); //Thread "schlafen" legen für 2ms, um zu reagieren (sonst zu schnell)
                //Nach sleep -> neue Tasten empfangen:
                Snake.move();
                Snake.waitToMove = false;
                //Collision:
                Collision.collideFood();
                Collision.collideSelf();
                Collision.collideWall();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
