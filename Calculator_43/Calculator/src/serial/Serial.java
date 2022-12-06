/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serial;

import static calculator.Calculator.invoke;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortException;


/**
 *
 * @author Rasha
 */
public class Serial {
    SerialPort port;
     String s ; 
      
    public Serial(String portname ,int paudRate) throws IOException
    {
        
           port = new SerialPort(portname);
               try {
            port.openPort();
            port.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
        } catch (SerialPortException ex) {
            Logger.getLogger(Serial.class.getName()).log(Level.SEVERE, null, ex);
            try {
                port.closePort();
            } catch (SerialPortException ex1) {
                Logger.getLogger(Serial.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
               
    }
    
    
     public String readData() throws IOException, SerialPortException
    {
            port.addEventListener((SerialPortEvent event)->{
              if(event.isRXCHAR())
              {
                  try {
                       s = port.readString();
                      Platform.runLater(() -> {
                       invoke(s);
                            //text.setText(s);    
                        });
                  } catch (SerialPortException ex) {
                      Logger.getLogger(Serial.class.getName()).log(Level.SEVERE, null, ex);
                      try {
                          port.closePort();
                      } catch (SerialPortException ex1) {
                          Logger.getLogger(Serial.class.getName()).log(Level.SEVERE, null, ex1);
                      }
                  }
              }
            });
            
            return s;

    }
    
    
    
    
    
    
    }
    
        
        
    
    
    

