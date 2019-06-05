package recursivegraphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class CantorTernarySet extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        drawLine(root,0, 30, 900 );

        Scene scene = new Scene(root, 900, 200);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Cantor Ternary Set Visualization");
        primaryStage.show();
    }

    public void drawLine(Pane root, int startX, int vGap, int length){

        Line line = new Line(startX, vGap, startX+length, vGap);
        line.setStroke(Color.rgb(length/4, 0, 0, 1));
        root.getChildren().add(line);
        length=length/3;

        if(length>=2){
            drawLine(root, startX+0, vGap+30, length);
            drawLine(root, startX+2*length, vGap+30,  length);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}