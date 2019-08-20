/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author ANTO
 */
public class Movies extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text text1 = new Text ("Genres:");
        Text text2 = new Text("Name:");
        Text text3 = new Text("Registered:");
        ComboBox comboBox1 = new ComboBox();
        TextField textField = new TextField();
        ComboBox comboBox2 = new ComboBox();
        
        Button button1 = new Button("Save Movie");
        Button button2 = new Button("Remove Movie");
        
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        
        gridPane.add(text1, 0, 0);
        gridPane.add(comboBox1, 1, 0);
       
        
        gridPane.add(text2, 0, 2);
        gridPane.add(textField, 1, 2);
        gridPane.add(button1, 1, 3);
        
        gridPane.add(text3, 0, 4);
        gridPane.add(comboBox2, 1, 4);
        gridPane.add(button2, 1, 5);
        
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
                
        text1.setStyle("-fx-font: normal bold 20px 'serif'");
        text2.setStyle("-fx-font: normal bold 20px 'serif'");
        text3.setStyle("-fx-font: normal bold 20px 'serif'");
        gridPane.setStyle("-fx-background-color: BEIGE;");
        
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
