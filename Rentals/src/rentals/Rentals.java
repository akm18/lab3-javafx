/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentals;

import javafx.application.Application;
import static javafx.application.Application.launch;
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
public class Rentals extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Text text1 = new Text ("Customer:");
       Text text2 = new Text("Genre");
       Text text3 = new Text("Movies:");
       Text text4 = new Text("Borrowed:");
       Text text5 = new Text("Returned:");
        ComboBox comboBox1 = new ComboBox();
        ComboBox comboBox2 = new ComboBox();
        ComboBox comboBox3 = new ComboBox();
        ComboBox comboBox4 = new ComboBox();
        ComboBox comboBox5 = new ComboBox();
        
        
        Button button1 = new Button("Save Rental");
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
         gridPane.add(comboBox2, 1, 2);
         
         gridPane.add(text3, 0, 4);
         gridPane.add(comboBox3, 1, 4);
         gridPane.add(button1, 1, 5);
        
        gridPane.add(text4, 0, 6);
        gridPane.add(comboBox4, 1, 6);
        gridPane.add(button2, 1, 7);
        
         gridPane.add(text5, 0, 8);
         gridPane.add(comboBox5, 1, 8);
        
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
                
        text1.setStyle("-fx-font: normal bold 20px 'serif'");
        text2.setStyle("-fx-font: normal bold 20px 'serif'");
        text3.setStyle("-fx-font: normal bold 20px 'serif'");
        text4.setStyle("-fx-font: normal bold 20px 'serif'");
        text5.setStyle("-fx-font: normal bold 20px 'serif'");
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
