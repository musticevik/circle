package application;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import object.Circle3D;
import physicsMotor.Bounce3D;
import physicsMotor.Gravity3D;
import physicsMotor.Motion;
import world.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Panel3D extends Application {

    Room room = new Room(0, 800, 0, 800, 0, 800);
    ArrayList<Circle3D> balls = new ArrayList<>();
    Map<Circle3D, Sphere> sphereMap = new HashMap<>();
    Group root = new Group();
    PerspectiveCamera camera;

    // Default motions for new balls
    ArrayList<Motion> defaultMotions = new ArrayList<>();

    @Override
    public void start(Stage stage) throws Exception {
        defaultMotions.add(new Gravity3D());
        defaultMotions.add(new Bounce3D());


        //setup camera
        camera = new PerspectiveCamera(false);
        camera.setTranslateZ(-1000);

        Scene scene = new Scene(root, 800, 800, true);
        scene.setFill(Color.BLACK);
        scene.setCamera(camera);

        scene.setOnMouseClicked(event -> {
            double spawnX = event.getSceneX() + camera.getTranslateX();
            double spawnY = event.getSceneY() + camera.getTranslateY();
            spawnBall(spawnX, spawnY);
        });

        scene.setOnScroll((ScrollEvent event) -> {
            double zoomSpeed = 2.0;
            camera.setTranslateZ(camera.getTranslateZ() + event.getDeltaY() * zoomSpeed);
        });


        stage.setScene(scene);
        stage.show();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                for (Circle3D ball : balls) {
                    ball.update(ball, room);

                    Sphere sphere = sphereMap.get(ball);
                    if (sphere != null) {
                        sphere.setTranslateX(ball.coordinateX);
                        sphere.setTranslateY(ball.coordinateY);
                        sphere.setTranslateZ(ball.coordinateZ);
                    }
                }
            }
        };
        timer.start();
    }

    private void spawnBall(double x, double y) {
        ArrayList<Motion> motions = new ArrayList<>();
        motions.add(new Gravity3D());
        motions.add(new Bounce3D());

        Circle3D newBall = new Circle3D(motions, x, y, motions);
        balls.add(newBall);

        Sphere newSphere = new Sphere(10);
        newSphere.setTranslateX(x);
        newSphere.setTranslateY(y);
        newSphere.setTranslateZ(0);

        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.BLUE);
        newSphere.setMaterial(material);

        //added light in order to see the sphere
        root.getChildren().add(newSphere);
        root.getChildren().add(new PointLight(Color.WHITE));
        sphereMap.put(newBall, newSphere);
    }

    public static void main(String[] args) {
        launch();
    }
}
