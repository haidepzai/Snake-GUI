package gui;

import game.Snake;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {

    Point p;

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF); //Anti-Aliasing Off

        //Draw Background
        g.setColor(new Color(137, 204, 176)); //Hintergrundfarbe
        g.fillRect(0,0, Gui.width,Gui.height); //Fill

        //Draw Snake Tails
        g.setColor(new Color(107, 116, 204));
        for(int i = 0; i < Snake.tails.size(); i++){
            p = Snake.ptc(Snake.tails.get(i).getX(),Snake.tails.get(i).getY());
            g.fillRect(p.x,p.y,32,32);
        }

        //Draw Snake Head
        g.setColor(new Color(23, 21, 153));
        p = Snake.ptc(Snake.head.getX(),Snake.head.getY());
        g.fillRect(p.x,p.y,32,32);

        //Draw Food
        g.setColor(new Color(204,51,0));
        p = Snake.ptc(Snake.food.getX(), Snake.food.getY());
        g.fillOval(p.x,p.y,32,32);

        //Draw Grid (16x16 Fields)
       /* g.setColor(Color.BLACK);
        for(int x = 0; x < 16; x++){
            for(int y = 0; y < 16; y++){
                g.drawRect(x*32 + Gui.xOff, y*32 + Gui.yOff,32,32); //32x32px pro Feld
            }
        }*/

        //Draw Border
        g.setColor(Color.BLACK); //Schwarzer Rand
        g.drawRect(Gui.xOff, Gui.yOff, 512,512); //Spielfeldbreite 16x16 Felder bei 32x32px

        //Draw Score
        g.setFont(new Font("Arial", Font.BOLD,20));
        g.drawString("Score: " + Snake.score, 5,25);
        g.drawString("Highscore: " + Snake.highscore, 655,25);

        repaint(); //Ruft die Methode automatisch wieder auf
    }
}
