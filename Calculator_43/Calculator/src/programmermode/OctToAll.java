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
public class OctToAll {
        String Octal;

    public OctToAll(String Octal) {
        this.Octal = Octal;
    }

   
    
        public int  ToDec()
    {
        int Res =Integer.parseInt(Octal, 8);
        return Res;
    }
       
    public String ToHex()
    {
        int Dec = ToDec();
        String Res =Integer.toHexString(Dec);
        return Res;
    }
    
    public String ToBin()
    {
        int Dec = ToDec();
        String Res =Integer.toBinaryString(Dec);
        return Res;
    }
    
}
