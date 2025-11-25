import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class CirclePanel extends JPanel {
    public final ArrayList<Circle> circleArrayList = new ArrayList<Circle>();
    public CirclePanel (){

        setBackground(Color.BLACK);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                synchronized (circleArrayList) {
                    circleArrayList.add(new Circle(new CircleGravity(),e.getX(), e.getY()));
                }
                System.out.println("mouse clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        thread.start();

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        synchronized (circleArrayList) {
            for (Circle c : circleArrayList) {
                c.create(g);
            }
        }
    };

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                while (true) {
                    synchronized (circleArrayList) {
                        for (Circle c : circleArrayList) {
                            c.update();
                        }
                    }

                    repaint();
                    Thread.sleep(10);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });
//    thread.start();

}
