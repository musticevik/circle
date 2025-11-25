import java.awt.*;
import java.util.ArrayList;

public class Circle {
    public double velocityX; //type double for smoother movement
    public double velocityY;
    public double coordinateY;
    public double coordinateX;
    ArrayList<Motion> motions;
    public final CirclePanel panel;

    public Circle(ArrayList<Motion> motion, double coordinateX, double coordinateY, CirclePanel panel) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.motions =  motion;
        this.panel = panel;
        System.out.println("Circle constructor called");
    }

    void update(){
        for (Motion m : motions) {
            m.update(this, panel);
        }
        System.out.println("update method called (Circle class)");
    }

    void create(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval((int)coordinateX,(int)coordinateY, 10,10); //spawn location casted to int
        System.out.println("create method called (Circle class)");
    }


}
