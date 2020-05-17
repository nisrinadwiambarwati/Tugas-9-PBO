/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor_7;

/**
 *
 * @author ASUS
 */
public class GenMethod {
    static <T,V extends T> boolean isIn(T x, V[] y){
       for (int i=0; i < y.length; i++){
          if(x.equals(y[i])){
            return true;
          }
        }
    return false;
   }

 public static void main(String args[]) { 
    Integer nums[] = {1,2,3,4,5};
    
    if (isIn(2, nums)){
        System.out.println("2 is in nums");
    }
    if (!isIn(7, nums)){
        System.out.println("7 is not in nums");
    }
  
 String strs[] = {"satu", "dua", "tigah", "empat", "limah"};
 
    if (isIn("dua", strs))
        System.out.println("dua is in strs");
    
    if (!isIn("tujuh", strs))
        System.out.println("tujuh is not in strs");
  }
}