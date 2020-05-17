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
public class Student<T> {
    T age;
   Student(T age){
      this.age = age;
   }
   public void display() {
      System.out.println("Value: "+this.age);
   }
}

