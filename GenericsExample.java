/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor_8;

/**
 *
 * @author ASUS
 */
public class GenericsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
      Student<Float> std1 = new Student<Float>(25.5f);
      std1.display();
      Student<String> std2 = new Student<String>("25");
      std2.display();
      Student<Integer> std3 = new Student<Integer>(25);
      std3.display();
   }
}

