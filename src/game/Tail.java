package game;

public class Tail {
    int x;
    int y;
    boolean wait = true; //Wenn ein neuer Tailstück kommt, ist er in der Position des letzten Stücks
    //Letzter Tailstück muss einen Tick warten (sonst wird Teil nicht länger, wenn es gleichzeitig mitbewegt


    public Tail(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWait(boolean wait) {
        this.wait = wait;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isWait() {
        return wait;
    }
}
