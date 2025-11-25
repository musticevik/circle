import java.awt.*;

public class Circle {
    public double velocityX; //type double for smoother movement
    public double velocityY;
    public double coordinateY;
    public double coordinateX;
    Motion motion;

    public Circle(Motion motion,double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.motion =  motion;
        System.out.println("Circle constructor called");
    }

    void update(){
        motion.update(this);
        System.out.println("update method called (Circle class)");
    }

    void create(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval((int)coordinateX,(int)coordinateY, 10,10); //spawn location casted to int
        System.out.println("create method called (Circle class)");
    }


}
