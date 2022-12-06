/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmermode;

/**
 *
 * @author samir
 */
public class HexToAll {
          String Hex;

    public HexToAll(String Hex) {
        this.Hex = Hex;
    }


   
    
        public int  ToDec()
    {
        int Res =Integer.parseInt(Hex, 16);
        return Res;
    }
       
    public String ToOct()
    {
        int Dec = ToDec();
        String Res =Integer.toOctalString(Dec);
        return Res;
    }
    
    public String ToBin()
    {
        int Dec = ToDec();
        String Res =Integer.toBinaryString(Dec);
        return Res;
    }
    
}
