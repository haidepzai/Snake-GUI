package game;

import java.util.concurrent.ThreadLocalRandom;

public class Food {
    int x;
    int y;
    //Random (Start) Food (Initialize)
    public Food(){
        this.x = ThreadLocalRandom.current().nextInt(0,15);
        this.y = ThreadLocalRandom.current().nextInt(0,15);
    }
    //Wird jedes Mal aufgeruden, wenn Snake ein Food berührt
    public void reset(){
        this.x = ThreadLocalRandom.current().nextInt(0,15);
        this.y = ThreadLocalRandom.current().nextInt(0,15);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
