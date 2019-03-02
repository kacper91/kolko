package pl.orlowski;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.text.Position;

public class TicTacToe extends Application {

    private Image imageback = new Image("plansza.jpg");
    private Image cross = new Image("krzyzyk.jpg");
    //  private Image circle = new Image("kolko.jpg");

    private FlowPane figures = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(50, 50, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);


        ImageView imgCross = new ImageView(cross);
        figures.getChildren().add(imgCross);
//        ImageView imgCircle = new ImageView(circle);
//        figures.getChildren().add(imgCircle);

        grid.add(figures, 0, 0, 3, 1);

        Scene scene = new Scene(grid, 400, 400, Color.BLACK);

        primaryStage.setTitle("Kolko i Krzyzyk");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}