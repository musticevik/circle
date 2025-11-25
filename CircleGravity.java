public class CircleGravity extends Gravity{
    public Circle c;
    private final double gravity = 10;
    public CircleGravity(){}

    public void update(Circle c, CirclePanel p) {
        c.velocityY += gravity;
        c.coordinateY += c.velocityY;
    }
}

