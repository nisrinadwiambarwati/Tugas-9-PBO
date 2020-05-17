/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor_9;

/**
 *
 * @author ASUS
 */
interface MinMax<T extends Comparable<T>>
 { T min(); T max(); } 

public class MyClass <T extends Comparable<T>>
    implements MinMax<T> 
{ T[] vals; MyClass(T[] o) 
{ vals = o; }
 public T min() 
{ 
T v = vals[0]; for(int i=1; i < vals.length; i++) 
 if(vals[i].compareTo(v) < 0) v = vals[i]; return v; } 
 public T max() {
     
 T v = vals[0]; for(int i=1; i < vals.length; i++) 
     if(vals[i].compareTo(v) > 0) v = vals[i]; return v;
 }
 }

