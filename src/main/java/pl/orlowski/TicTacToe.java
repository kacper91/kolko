package pl.orlowski;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class TicTacToe extends Application {

    private Image imageback = new Image("plansza.jpg");
    private Image cross = new Image("krzyzyk.jpg");
    private Image circle = new Image("kolko.jpg");
    private boolean turn = false;
    private boolean setA;
    private boolean playerTurn;
//    private Label status = new Label();


    private FlowPane figures = new FlowPane(Orientation.HORIZONTAL);

    public Image getCross() {
        return cross;
    }

    public Image getCircle() {
        return circle;
    }

    public Image getTurn() {
        if (!turn) {
            turn = true;
            return getCross();

        } else {
            turn = false;
            return getCircle();

        }
    }

    public void turnCheck() {

        if (setA) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error!");
            alert.setHeaderText("This move is not allowed!");
            alert.setContentText("Choose another field");
            alert.showAndWait();

        }
        setA = true;

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //BackgroundSize(double width, double height, boolean widthAsPercentage, boolean heightAsPercentage, boolean contain, boolean cover)
        BackgroundSize backgroundSize = new BackgroundSize(600, 600, false, false, false, false);
        //BackgroundImage(Image image, BackgroundRepeat repeatX, BackgroundRepeat repeatY, BackgroundPosition position, BackgroundSize size)
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);

//
//        status.setText("Kolejny znak: "+getTurn().toString());
//        status.setTextFill(Color.web("FFF"));
//        status.setFont(new Font("Arial", 24));


        Button btnA1 = new Button();
        btnA1.setBackground(null);
        btnA1.setOnMouseClicked((e) -> {
            if (!setA) {
                btnA1.setGraphic(new ImageView(getTurn()));
                turnCheck();

            }
        });
        btnA1.setPrefWidth(200);
        btnA1.setPrefHeight(200);


        Button btnA2 = new Button();
        btnA2.setBackground(null);
        btnA2.setOnMouseClicked((e) -> btnA2.setGraphic(new ImageView(getTurn())));
        btnA2.setPrefWidth(200);
        btnA2.setPrefHeight(200);

        Button btnA3 = new Button();
        btnA3.setBackground(null);
        btnA3.setOnMouseClicked((e) -> btnA3.setGraphic(new ImageView(getTurn())));
        btnA3.setPrefWidth(200);
        btnA3.setPrefHeight(200);

        Button btnB1 = new Button();
        btnB1.setBackground(null);
        btnB1.setOnMouseClicked((e) -> btnB1.setGraphic(new ImageView(getTurn())));
        btnB1.setPrefWidth(200);
        btnB1.setPrefHeight(200);

        Button btnB2 = new Button();
        btnB2.setBackground(null);
        btnB2.setOnMouseClicked((e) -> btnB2.setGraphic(new ImageView(getTurn())));
        btnB2.setPrefWidth(200);
        btnB2.setPrefHeight(200);

        Button btnB3 = new Button();
        btnB3.setBackground(null);
        btnB3.setOnMouseClicked((e) -> btnB3.setGraphic(new ImageView(getTurn())));
        btnB3.setPrefWidth(200);
        btnB3.setPrefHeight(200);

        Button btnC1 = new Button();
        btnC1.setBackground(null);
        btnC1.setOnMouseClicked((e) -> btnC1.setGraphic(new ImageView(getTurn())));
        btnC1.setPrefWidth(200);
        btnC1.setPrefHeight(200);

        Button btnC2 = new Button();
        btnC2.setBackground(null);
        btnC2.setOnMouseClicked((e) -> btnC2.setGraphic(new ImageView(getTurn())));
        btnC2.setPrefWidth(200);
        btnC2.setPrefHeight(200);

        Button btnC3 = new Button();
        btnC3.setBackground(null);
        btnC3.setOnMouseClicked((e) -> btnC3.setGraphic(new ImageView(getTurn())));
        btnC3.setPrefWidth(200);
        btnC3.setPrefHeight(200);


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);

        grid.setPadding(new Insets(0, 0, 0, 0));
        grid.setHgap(0);
        grid.setVgap(0);


//        turnLabel.setText("Etykieta testowa");
//        turnLabel.setFont(new Font("Arial", 24));

        Background background = new Background(backgroundImage);
        grid.setBackground(background);
        grid.add(btnA1, 0, 0);
        grid.add(btnA2, 0, 20);
        grid.add(btnA3, 0, 40);
        grid.add(btnB1, 20, 0);
        grid.add(btnB2, 20, 20);
        grid.add(btnB3, 20, 40);
        grid.add(btnC1, 40, 0);
        grid.add(btnC2, 40, 20);
        grid.add(btnC3, 40, 40);
//        grid.add(status,10,60);
//        grid.add(turnLabel, 20, 30, 0, 0 );


//        figures.getChildren().add(imgCross);

//        figures.getChildren().add(imgCircle);
//
//        grid.add(figures, 0, 1, 10, 1);

        Scene scene = new Scene(grid, 600, 900, Color.BLACK);


        primaryStage.setTitle("Kolko i Krzyzyk");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}