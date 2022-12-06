/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package calculator;

import java.awt.AWTException;
import java.awt.Robot;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import serial.Serial;


/**
 *
 * @author Rasha
 */

public class Calculator extends Application {

    
    @Override
    public void start(Stage stage) throws Exception {
         Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        scene.getStylesheets().add("/CSS/samples.css");
        stage.setOpacity(0.899);
        
        stage.setScene(scene);
        stage.show();
    }
    
    
  public static void  invoke(String key){
        Robot r;
        try {
            r = new Robot();
            switch(key){
                case"/":
                    r.keyPress(java.awt.event.KeyEvent.VK_DIVIDE);
                    break;
                case"*":
                    r.keyPress(java.awt.event.KeyEvent.VK_SHIFT);                    
                    r.keyPress(java.awt.event.KeyEvent.VK_8);                    
                    r.keyRelease(java.awt.event.KeyEvent.VK_SHIFT);                    
                    break;
                case"-":
                    r.keyPress(java.awt.event.KeyEvent.VK_MINUS);                                  
                    break;
                case"+":
                    r.keyPress(java.awt.event.KeyEvent.VK_SHIFT);                    
                    r.keyPress(java.awt.event.KeyEvent.VK_EQUALS);                    
                    r.keyRelease(java.awt.event.KeyEvent.VK_SHIFT);                
                    break;
                case"1":                    
                    r.keyPress(java.awt.event.KeyEvent.VK_1);                    
                    break;
                case"2":
                    r.keyPress(java.awt.event.KeyEvent.VK_2);                    
                    break;
                case"3":
                    r.keyPress(java.awt.event.KeyEvent.VK_3);                    
                    break;
                case"4":
                    r.keyPress(java.awt.event.KeyEvent.VK_4);                    
                    break;
                case"5":
                    r.keyPress(java.awt.event.KeyEvent.VK_5);                    
                    break;
                case"6":
                    r.keyPress(java.awt.event.KeyEvent.VK_6);                    
                    break;
                case"7":
                    r.keyPress(java.awt.event.KeyEvent.VK_7);                    
                    break;
                case"8":
                    r.keyPress(java.awt.event.KeyEvent.VK_8);                    
                    break;
                case"9":
                    r.keyPress(java.awt.event.KeyEvent.VK_9);                    
                    break;
                case"0":
                    r.keyPress(java.awt.event.KeyEvent.VK_0);                    
                    break;
                case".":
                    r.keyPress(java.awt.event.KeyEvent.VK_PERIOD);                    
                    break;
                case"=":
                    r.keyPress(java.awt.event.KeyEvent.VK_ENTER);                            
                   break;
            }
        } catch (AWTException ex) {}
        
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Thread(new Runnable()
        {
            @Override
            public void run() {
                try{
              Serial serial = new Serial("COM6" ,9600);
                  String out = serial.readData();
              
                while(true)
                {
                    
                    
                    
                }
                }catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            
        }
        ).start();
        launch(args);
    }
    
}
