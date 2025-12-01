package object;

import physicsMotor.CircleVelocity;
import physicsMotor.Motion;
import world.Room;

import java.awt.*;
import java.util.ArrayList;

public class Circle3D {
    public CircleVelocity velocityX;
    public CircleVelocity velocityY;
    public CircleVelocity velocityZ;

    public double coordinateY;
    public double coordinateX;
    public double coordinateZ;

    ArrayList<Motion> motions;
    public final ArrayList<Motion> panel;

    public Circle3D(ArrayList<Motion> motion, double coordinateX, double coordinateY, ArrayList<Motion> panel) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = 0;

        this.velocityX = new CircleVelocity(0);
        this.velocityY = new CircleVelocity(0);
        this.velocityZ = new CircleVelocity(0);

        this.motions = motion;
        this.panel = panel;
        System.out.println("object.Circle3D constructor called");
    }

    public void update(Circle3D circle3D, Room r) {
        for (Motion m : motions) {
            m.update(this, r);
        }
        System.out.println("update method called (object.Circle3D class)");
    }

    void create(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval((int) coordinateX, (int) coordinateY, 10, 10); // spawn location casted to int
        System.out.println("create method called (object.Circle3D class)");
    }
}
