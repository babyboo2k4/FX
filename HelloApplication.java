package org.example.youtube;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

public class HelloApplication extends Application {
    Stage window;
//    Scene scene1, scene2;
//    Button button;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primarystage) throws Exception {
        window = primarystage;
        window.setTitle("Bộ đẹp trai");

        HBox topMenu = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);


        VBox leftMenu = new VBox();
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);


//        window.setOnCloseRequest(e-> {
//            e.consume();
//            closeProgram();
//        });
//
//        button = new Button("close program");
//        button.setOnAction(e-> closeProgram());
//        button.setOnAction(e->{
//            boolean result =  ConfirmBox.display("Title of window", "Are you sure you want to send naked pics?");
//            System.out.println(result);
//        });

        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
        Scene scene = new Scene(borderPane, 300, 250);
        window.setScene(scene);
        window.show();
//
//        Label label1 = new Label("Welcome to the first scene");
//        Button button1 = new Button("Go to scene 2");
//        button1.setOnAction(e ->window.setScene(scene2));
//
//        VBox layout1 = new VBox(20);
//        layout1.getChildren().addAll(label1, button1);
//        scene1 = new Scene(layout1, 200, 200);
//
//        Button button2 = new Button("Go back to scene 1");
//        button2.setOnAction(e ->window.setScene(scene1));
//
//        StackPane layout2 = new StackPane();
//        layout2.getChildren().add(button2);
//        scene2 = new Scene(layout2, 600, 300);
//
//        window.setScene(scene1);
//        window.setTitle("What's the fuck");
//        window.show();
    }

//    private void closeProgram() {
////        System.out.println("File is saved");
////        window.close();
//        Boolean answer = ConfirmBox.display("Title", "Sure you want toexit");
//        if (answer)
//            window.close();
//    }
}

