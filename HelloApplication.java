package org.example.tableview;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class   HelloApplication extends Application implements EventHandler<ActionEvent> {
    Button button;

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start (Stage primaryStage) throws Exception{
        primaryStage.setTitle("Title of the window");
        button = new Button();
        button.setText("Hey hey");
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("I am your boyfriend");
//            }
//        });
        button.setOnAction(e->{
            System.out.println("I love you, babe");
            System.out.println("I love you so much,babe");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource()==button) {
            System.out.println("What's the fuck is going on");
        }
        //
    }
}