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
public class DecToAll {
    private int Dec;

    public DecToAll(int Dec) {
        this.Dec = Dec;
    }
    
    public String ToBin()
    {
        String Res =Integer.toBinaryString(Dec);
        return Res;
    }
    
    public String ToHex()
    {
        String Res =Integer.toHexString(Dec);
        return Res;
    }
    
    public String ToOct()
    {
        String Res =Integer.toOctalString(Dec);
        return Res;
    }
    
}
