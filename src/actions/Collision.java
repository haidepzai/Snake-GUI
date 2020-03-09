package actions;

import clocks.GameClock;
import game.Snake;

public class Collision {

    public static void collideSelf(){
        for(int i = 0; i < Snake.tails.size(); i++){
            if(Snake.head.getX() == Snake.tails.get(i).getX() && Snake.head.getY() == Snake.tails.get(i).getY() && !Snake.tails.get(i).isWait()){
                Snake.tails.clear(); //Tails Reset
                Snake.score = 0; //Score Reset
                GameClock.speed = 200;

            }
        }
    }

    public static void collideWall(){
        if (Snake.head.getX() < 0 || Snake.head.getX() > 15 || Snake.head.getY() < 0 || Snake.head.getY() > 15 ){
            Snake.tails.clear();
            //Wieder in die Mitte setzen
            Snake.head.setX(7);
            Snake.head.setY(7);
            Snake.score = 0; //Score reset
            GameClock.speed = 200;
        }
    }

    public static void collideFood() {
        if (Snake.head.getX() == Snake.food.getX() && Snake.head.getY() == Snake.food.getY()) {
            Snake.food.reset();
            Snake.addTail();
            Snake.score++;
            GameClock.speed /= 1.1;
            if (Snake.score > Snake.highscore) {
                Snake.highscore = Snake.score;
            }

        }
    }
}
