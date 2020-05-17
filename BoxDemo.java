/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box;

/**
 *
 * @author ASUS
 */
public class BoxDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.add (new Integer(10));
        Integer someInteger = integerBox.get();
        System.out.println(someInteger);
    }
    
}
