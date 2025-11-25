public class Gravity implements Motion {
    private final double gravity = 2;
    @Override
    public void update(Circle c, CirclePanel p) {
        c.velocityY += gravity;
        c.coordinateY += c.velocityY;
    }
}
