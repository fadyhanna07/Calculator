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
public class BinToAll {
    String Binary;

    public BinToAll(String Binary) {
        this.Binary = Binary;
    }
    
        public int  ToDec()
    {
        int Res =Integer.parseInt(Binary, 2);
        return Res;
    }
       
    public String ToHex()
    {
        int Dec = ToDec();
        String Res =Integer.toHexString(Dec);
        return Res;
    }
    
    public String ToOct()
    {
        int Dec = ToDec();
        String Res =Integer.toOctalString(Dec);
        return Res;
    }
    
}
