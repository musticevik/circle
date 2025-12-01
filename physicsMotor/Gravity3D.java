package physicsMotor;

import object.Circle3D;
import world.Room;

public class Gravity3D implements Motion {
    private final double gravity = 0.4;

    @Override
    public void update(Circle3D c, Room r) {
        c.velocityY.velocity += gravity;
        c.coordinateY += c.velocityY.velocity;
    }
}
