// A Java Program to create a text input dialog 
// and add a label to display the result of the number which is converted

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.control.*; 
import javafx.stage.Stage; 
import javafx.scene.control.Alert.AlertType; 
import java.time.LocalDate;
import java.util.*;

public class TextInputDialog_2 extends Application {
    //function that converts a string roman input and returns an arabic number 
    public static int romanToArabic(String input) {
    String romanNumeral = input.toUpperCase();
    int result = 0;
         
    List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();
 
    int i = 0;
 
    while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
        RomanNumeral symbol = romanNumerals.get(i);
        if (romanNumeral.startsWith(symbol.name())) {
            result += symbol.getValue();
            romanNumeral = romanNumeral.substring(symbol.name().length());
        } else {
            i++;
        }
    }
 
    if (romanNumeral.length() > 0) {
        throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
    }
 
    return result;
}
// function thagt gets an arabic number as an input and returns a roman numeral
    public static String arabicToRoman(int number) {
    if ((number <= 0) || (number > 3000)) {
        throw new IllegalArgumentException(number + " is not in range (0,3000]");
    }
 
    List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();
 
    int i = 0;
    StringBuilder sb = new StringBuilder();
 
    while ((number > 0) && (i < romanNumerals.size())) {
        RomanNumeral currentSymbol = romanNumerals.get(i);
        if (currentSymbol.getValue() <= number) {
            sb.append(currentSymbol.name());
            number -= currentSymbol.getValue();
        } else {
            i++;
        }
    }
 
    return sb.toString();
}

    // launch the application 
    public void start(Stage s) 
    { 
        // title for the stage 
        s.setTitle("Converting Roman to Arabic numerals"); 

        // a tile pane 
        TilePane r = new TilePane(); 

        //a label to show the input in text dialog 
        Label l = new Label("Please choose the type of convertion!!"); 

        // a text input dialog 
        TextInputDialog td = new TextInputDialog("Converting roman to arabic"); 
        td.setHeaderText("enter your number here");
        TextInputDialog td2 = new TextInputDialog("Converting arabic to roman"); 
        td.setHeaderText("enter your number here");

        // two buttons for conversion 
        Button d = new Button("Convert From Roman to Arabic");
        Button c = new Button("Convert From Arabic to Roma"); 

        // An event handler 
        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
                // show the text input dialog 
                td.showAndWait();
                
                // set the text of the label to the arabic number that has been returend from the function 
                l.setText(Integer.toString(romanToArabic(td.getEditor().getText())));

                
                
                
            } 
        }; 

        // set on action of event 
        d.setOnAction(event1); 
        
        // another event handler
        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
                // show the text input dialog 
                td2.showAndWait(); 
                int i = Integer.parseInt(td2.getEditor().getText());

                // set the text of the label to the roman numeral returned from the function  
                l.setText(arabicToRoman(i));
                 
                
            } 
        }; 
        // sets on action of event 
        c.setOnAction(event2);

        // adds buttons and label 
        r.getChildren().add(d); 
        r.getChildren().add(c);
        r.getChildren().add(l); 

        // creates a scene 
        Scene sc = new Scene(r, 500, 300); 

        // sets the scene 
        s.setScene(sc); 

        s.show(); 
    } 

    public static void main(String args[]) 
    { 
        // launch the application 
        launch(args); 
    } 
} 
