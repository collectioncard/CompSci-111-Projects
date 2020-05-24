package project6fx;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.stage.Stage;
/**
 * Programmer: Benjamin Riveira
 */
public class Project6 extends Application {
    
    Shape[] shapes = new Shape[100];
    
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.WHITE);
        final Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        int count = 0;
        double totalArea = 0;
        
        shapes[count++] = new Circle(250, 120, 150);
        shapes[count++] = new Triangle(350, 30, 100, 100);
        shapes[count++] = new Rectangle(550, 250, 40, 40);
        shapes[count++] = new Rectangle(210, 250, 40, 40);
        shapes[count++] = new Circle(300, 200, 30);
        shapes[count++] = new Circle(440, 200, 30);
        shapes[count++] = new Circle(320, 210, 5);
        shapes[count++] = new Circle(470, 240, 5);
        shapes[count++] = new Rectangle(330, 315, 50, 150);
        // Change the name "Rectangle" to "Square" in all of
        // the statements below this comment in phase 2 only.
        /*  
        shapes[count++] = new Rectangle(330, 315, 25, 25);
        shapes[count++] = new Rectangle(355, 315, 25, 25);
        shapes[count++] = new Rectangle(380, 315, 25, 25);
        shapes[count++] = new Rectangle(405, 315, 25, 25);
        shapes[count++] = new Rectangle(430, 315, 25, 25);
        shapes[count++] = new Rectangle(455, 315, 25, 25);
        shapes[count++] = new Rectangle(330, 340, 25, 25);
        shapes[count++] = new Rectangle(355, 340, 25, 25);
        shapes[count++] = new Rectangle(380, 340, 25, 25);
        shapes[count++] = new Rectangle(405, 340, 25, 25);
        shapes[count++] = new Rectangle(430, 340, 25, 25);
       */
        shapes[count++] = new Square(330, 315, 25, 25);
        shapes[count++] = new Square(355, 315, 25, 25);
        shapes[count++] = new Square(380, 315, 25, 25);
        shapes[count++] = new Square(405, 315, 25, 25);
        shapes[count++] = new Square(430, 315, 25, 25);
        shapes[count++] = new Square(455, 315, 25, 25);
        shapes[count++] = new Square(330, 340, 25, 25);
        shapes[count++] = new Square(355, 340, 25, 25);
        shapes[count++] = new Square(380, 340, 25, 25);
        shapes[count++] = new Square(405, 340, 25, 25);
        shapes[count++] = new Square(430, 340, 25, 25);
        shapes[count++] = new Square(455, 340, 25, 25);
        shapes[count++] = new Square(380, 220, 40, 50);
        
        for(Shape s : shapes) {
            if(s != null) {
                s.display();
                 s.display(gc);
                 s.display(gc);
                 s.display(gc);
                 s.display(gc);
                 s.display(gc);
                 s.display(gc);
                 s.display(gc);
                totalArea += s.getArea();
                // Uncomment the lines below in phase 3 only
                //gc.setFill(Color.WHITE);
                //gc.setStroke(Color.BLACK);
                //s.display(gc);
            }
        }
        System.out.printf("%d shapes with total area %10.2f\n", count, totalArea);
        
        root.getChildren().add(canvas);
        primaryStage.setTitle("Project 6 FX");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }  
}
