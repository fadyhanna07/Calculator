/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmermode;

import java.util.regex.Pattern;

/**
 *
 * @author samir
 */
public class BitWiseOpreation {
private String op1;
private String op2;
private String opreation;
private String Mode;

    public BitWiseOpreation(String op1, String op2, String opreation, String Mode) {
        this.op1 = op1;
        this.op2 = op2;
        this.opreation = opreation;
        this.Mode = Mode;
    }

  

public String SolveBitWise()
{
    int a,b;
   switch (Mode)
   {
   case "HEX":
       a = new HexToAll(op1).ToDec();
       b = new HexToAll(op2).ToDec();
       switch(opreation)
       {
           case "AND": a&=b; 
           return new DecToAll(a).ToHex();
           case "OR": a|=b; 
           return new DecToAll(a).ToHex();
           case "NOT": a=(~a); 
           return new DecToAll(a).ToHex();
           case "XOR": a^=b; 
           return new DecToAll(a).ToHex();
       }
    break;
    
   case "BIN":
       a = new BinToAll(op1).ToDec();
       b = new BinToAll(op2).ToDec();
       switch(opreation)
       {
           case "AND": a&=b; 
           return new DecToAll(a).ToBin();
           case "OR": a|=b; 
           return new DecToAll(a).ToBin();
           case "NOT": a=(~a); 
           return new DecToAll(a).ToBin();
           case "XOR": a^=b; 
           return new DecToAll(a).ToBin();
       }
    break;
     
   case "OCT":
       a = new OctToAll(op1).ToDec();
       b = new OctToAll(op2).ToDec();
       switch(opreation)
       {
           case "AND": a&=b; 
           return new DecToAll(a).ToOct();
           case "OR": a|=b; 
           return new DecToAll(a).ToOct();
           case "NOT": a=(~a); 
           return new DecToAll(a).ToOct();
           case "XOR": a^=b; 
           return new DecToAll(a).ToOct();
       }
    break;
     case "DEC":
       a = Integer.parseInt(op1);
       b = Integer.parseInt(op2);
       switch(opreation)
       {
           case "AND": a&=b; 
           return Integer.toString(a);
           case "OR": a|=b; 
           return Integer.toString(a);
           case "NOT": a=(~a); 
           return Integer.toString(a);
           case "XOR": a^=b; 
           return Integer.toString(a);
       }
    break;
   }
 


   return null;
}


}