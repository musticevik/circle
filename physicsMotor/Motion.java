package physicsMotor;

import object.Circle3D;
import world.Room;

public interface Motion {
    void update(Circle3D c, Room r);
}
