package pl.orlowski;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class TicTacToe extends Application {

    private Image imageback = new Image("plansza.jpg");
    private Image cross = new Image("krzyzyk.jpg");
    private Image circle = new Image("kolko.jpg");

    private FlowPane figures = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //BackgroundSize(double width, double height, boolean widthAsPercentage, boolean heightAsPercentage, boolean contain, boolean cover)
        BackgroundSize backgroundSize = new BackgroundSize(50, 50, true, true, true, false);
        //BackgroundImage(Image image, BackgroundRepeat repeatX, BackgroundRepeat repeatY, BackgroundPosition position, BackgroundSize size)
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);


        Button btnA1 = new Button("button A1");
        btnA1.setGraphic(new ImageView(circle));
        btnA1.setOnMouseClicked((e) -> System.out.println("wcisnieto A1"));


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);


        grid.setPadding(new Insets(-381.5, 212.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);
        grid.add(btnA1,1,1);


        ImageView imgCross = new ImageView(cross);
        figures.getChildren().add(imgCross);
        ImageView imgCircle = new ImageView(circle);
        figures.getChildren().add(imgCircle);

        grid.add(figures, 0, 1, 10, 1);

        Scene scene = new Scene(grid, 600, 800, Color.BLACK);


        primaryStage.setTitle("Kolko i Krzyzyk");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}