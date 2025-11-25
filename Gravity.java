public class Gravity implements Motion {
    private final double gravity = 0.5;
    @Override
    public void update(Circle c) {
        c.velocityY += gravity;
        c.coordinateY += c.velocityY;
    }
}
