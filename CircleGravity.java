public class CircleGravity extends Gravity{
    public Circle c;

    public CircleGravity(){}

    public void update(Circle c){
        c.velocityY += 0.5;
        c.coordinateY += c.velocityY;
    }
}

