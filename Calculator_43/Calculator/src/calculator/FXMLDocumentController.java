/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package calculator;


import java.awt.event.KeyEvent;
import mathTree.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author Rasha
 */
public class FXMLDocumentController implements Initializable {
    
    boolean setZero=false;
    
    public static Stage window;
    private Image dark_image;
    @FXML
    private ImageView option_image;
    @FXML
    private Text mode;
    @FXML
    private TextField text;
    @FXML
    private ImageView standard_img;
    @FXML
    private ImageView Scientific_img;
    @FXML
    private ImageView Programmer_img;
    @FXML
    private ImageView dark_light_img;
    @FXML
    private ToggleButton selectedButton;
    
    MathTree calcTree = new MathTree();
       
        // System.out.println(calcTree.solve());
    @FXML
    private Button root;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        // TODO


        Image op_image=new Image(getClass().getResourceAsStream("/images/option.png"));
        option_image.setImage(op_image);
        
        Image st_image=new Image(getClass().getResourceAsStream("/images/standard.png"));
        standard_img.setImage(st_image);   
        
        Image sc_image=new Image(getClass().getResourceAsStream("/images/scientific_icon.png"));
        Scientific_img.setImage(sc_image);        
        
        Image pr_image=new Image(getClass().getResourceAsStream("/images/programmer.png"));
        Programmer_img.setImage(pr_image);   

         dark_image=new Image(getClass().getResourceAsStream("/images/darkMode.png"));
         //light_image=new Image(getClass().getResourceAsStream("/images/light.png"));
         dark_light_img.setImage(dark_image);  
        
        text.setText("0");

        
    }    

    @FXML
    private void write_num(ActionEvent event) {
         Button pressed = (Button)event.getSource();
         if(setZero)
         {setZero=false;
         text.setText("0");
         }
        if(text.getText().equals("0"))
         {text.setText("");
         }
            text.appendText(pressed.getText());
            //text.appendText(out);
            System.out.println(pressed.getText());

    }

    @FXML
    private void operation(ActionEvent event) {
        
         Button pressed = (Button)event.getSource();
         
         if(pressed.getText()=="C")
         {
             
         }
         
         
         if(setZero)
         {
             setZero=false;
         }
        text.appendText(pressed.getText());
    }

    @FXML
    private void remove_one_char(ActionEvent event) {
        String x=text.getText();
        if(x.length()==1){
        text.setText("0");
        }
        else
            text.setText(text.getText(0,x.length()-1 ));

        

       
    }

    @FXML
    private void clear_function(ActionEvent event) {
        text.setText("0");
    }

    private void dot_function(ActionEvent event) {
        String x=text.getText();
        if( x.contains("."))
        {
        }
            
        else 
        {
                text.appendText(".");
                
        
        }
 
    }

    @FXML
    private void dark_light_mode(ActionEvent event) throws IOException {


        
    }

    @FXML
    private void equal_function(ActionEvent event) {
        if(calcTree.init(text.getText()))
        text.setText(calcTree.solve().toString());
        
        setZero=true;
    }

    @FXML
    private void inverse_function(ActionEvent event) {
        Double x=1/Double.parseDouble(text.getText());
        System.out.println(x);
        
        text.setText(x.toString());
        
        setZero=true;
        
    }

    @FXML
    private void programer_mode(ActionEvent event) throws IOException {
        
try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLProgramer.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
    } catch(Exception e) {
        e.printStackTrace();
    }

        
        
    }

    @FXML
    private void Scientific_mode(ActionEvent event) {
        

try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLScientific.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
    } catch(Exception e) {
        e.printStackTrace();
    }

        
        
    }

    @FXML
    private void Standard_mode(ActionEvent event) {
        
try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
    } catch(Exception e) {
        e.printStackTrace();
    }
        
        
        
    }

    @FXML
    private void root_function(ActionEvent event) {
       // text.getText( );
        
    }
    
    void fun(){
    text.appendText("1+2=3");
    }

    @FXML
    private void listen_pressed(javafx.scene.input.KeyEvent event) {


        
                
  new Thread(new Runnable() {
    @Override public void run() {
   
        Platform.runLater(new Runnable() {
            @Override public void run() {
                System.out.println(event.getText());
        
        
        if(event.isShiftDown()){
            
             if(setZero)
         {
             setZero=false;
         }
            switch(event.getCode()){
                case EQUALS:
                    text.appendText("+");
                    break;
                case DIGIT8:
 
                    text.appendText("*");
                    break;
                
                case DIGIT5:

                    text.appendText("/");
                    break;

            }
        }
        
        else if(event.getCode().isDigitKey()){
            
          if(setZero)
         {setZero=false;
         text.appendText("0");
         }
        if(text.getText().equals("0"))
         {text.setText("");
         }
       
            text.appendText(event.getText());
        }
        
        
        else {
        
         switch(event.getCode()){
             
           case SLASH:
                {
                if(setZero){ setZero=false;}
          text.appendText("/");
                    break;}
                case DIVIDE:
                { if(setZero){ setZero=false;}
                    text.appendText("/");
                    break;}
                case MINUS:
                {if(setZero){ setZero=false;}
                    text.appendText("-");
                    break;}
                case SUBTRACT:
                {if(setZero){ setZero=false;}
                    text.appendText("-");
                    break;}
                case ADD:
 
                {if(setZero){ setZero=false;}
                    text.appendText("+");
                    break;
                }
                case MULTIPLY:
                {if(setZero){ setZero=false;}
                    text.appendText("*");
                    break;
                }
                case EQUALS:
                {
                        if(calcTree.init(text.getText()))
                    text.setText(calcTree.solve().toString());
        
                        setZero=true;
                }
   
                    break; 
             
            case ENTER:
                {
                                            if(calcTree.init(text.getText()))
                    text.setText(calcTree.solve().toString());
        
                        setZero=true;
                }

                case PERIOD:
                {{
                    String x=text.getText();
                
                if( x.contains("."))
                {
                    if(x.contains("+")||x.contains("-")||x.contains("*")||x.contains("/"))
                    {text.appendText(".");
                    }
                }
                else 
                {
                text.appendText(".");}
                }
                    
                    break;
                }
                    
                case DECIMAL:
                {
                    String x=text.getText();
                
                if( x.contains("."))
                {
                    if(x.contains("+")||x.contains("-")||x.contains("*")||x.contains("/"))
                    {text.appendText(".");
                    }
                }
                else 
                {
                text.appendText(".");}
                }
                    
                    break;
                }

            }
            }
        });
    
    }}).start();
    }   
    }

    

