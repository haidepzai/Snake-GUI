package gui;

import actions.KeyHandler;

import javax.swing.*;

public class Gui {
    JFrame frame;
    Draw d;
    //Fenster:
    public static int width = 800;
    public static int height = 600;
    //Spielfeld:
    public static int xOff = 130; //Margin-Left
    public static int yOff = 20;  //Margin-Top

    public void create(){
        frame = new JFrame("snake");
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //Starten des Programms in der Mitte
        frame.setResizable((false));
        frame.addKeyListener(new KeyHandler());

        d = new Draw();
        d.setBounds(0,0,width,height); //Von links oben nach rechts unten
        d.setVisible(true);
        frame.add(d);  //Hinzufügen ins frame

        frame.requestFocus(); //Für Tastatureingabe
        frame.setVisible(true);

    }
}
