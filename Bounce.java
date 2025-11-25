public class Bounce implements Motion{
    private final double bounceCoefficient = 1;
    private final double FLOOR = 800;
    @Override

    public void update(Circle c, CirclePanel p) {
    double bottom = p.getHeight() -10; // -10 because 10 is the radius of the circle
    c.coordinateY =  bottom - Math.abs(bottom - c.coordinateY);
    c.velocityY = -c.velocityY*bounceCoefficient;
    }
}
