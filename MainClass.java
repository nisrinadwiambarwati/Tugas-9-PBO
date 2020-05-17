/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiGen;

/**
 *
 * @author ASUS
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               MultiGen<Integer, String> tgobj = new MultiGen<Integer, String>(88, "Generics");
        tgobj.showTypes();
        
        int V = tgobj.getobj1();
        System.out.println("Value: "+ V);
        
        String str = tgobj.getobj2();
        System.out.println("Value: "+ str);
    }
    
}