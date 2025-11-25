import javax.swing.*;

public class CircleFrame extends JFrame {
    public CircleFrame() {
        setTitle("Circle Simulation");
        add(new CirclePanel());
        setSize(800,800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CircleFrame();
    }
}
