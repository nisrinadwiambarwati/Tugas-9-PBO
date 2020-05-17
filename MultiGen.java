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
public class MultiGen<T,V> {
    T obj1;
     V obj2;
    
    MultiGen(T o1, V o2){
        obj1 = o1;
        obj2 = o2;
    }
    void showTypes(){
        System.out.println("Type dari T adalah" + obj1.getClass().getName());
        System.out.println("Type dari V adalah" + obj2.getClass().getName());
    }
    
    T getobj1(){
      return obj1;
    }
    
    V getobj2(){
      return obj2;
    }
}

