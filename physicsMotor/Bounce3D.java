package physicsMotor;

import object.Circle3D;
import world.Room;

public class Bounce3D implements Motion {
    private final double bounceCoefficient = 1;
    private final double FLOOR = 800;
    double sideMinX = 10;
    double sideMaxX = 790;
    double sideMinZ = 10;
    double sideMaxZ = 790;
    double intervalX = sideMaxX - sideMinX;
    double intervalZ = sideMaxZ - sideMinZ;

    @Override
    public void update(Circle3D c, Room r) {

        c.coordinateY = reflect(c.velocityY, c.coordinateY, r.minY + 10, r.maxY - 10, bounceCoefficient);
        c.coordinateX = reflect(c.velocityX, c.coordinateX, sideMinX, sideMaxZ, bounceCoefficient);
        c.coordinateZ = reflect(c.velocityZ, c.coordinateZ, sideMinZ, sideMaxZ, bounceCoefficient);

    }

    // This method reflects provides reflection logic without using if-else or
    // switch case.
    // It uses Absolute formula and modula operator.
    public static double reflect(CircleVelocity velocity, double pos, double min, double max, double bounceCoefficient) {

        double range = max - min;
        double doubleRange = 2 * range;

        double distBefore = (pos - min) % doubleRange;
        double distAfter = (distBefore + doubleRange) % doubleRange;

        double newPos = min + range - Math.abs(distAfter - range);

        double sign = Math.signum(distAfter - range);
        velocity.velocity = -velocity.velocity * sign * bounceCoefficient;

        return newPos;
    }

}
