/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biodata;

/**
 *
 * @author ASUS
 */
public class latihan_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biodata<String> nama = new Biodata<>();
        nama.setManusia("Nisrina");
        System.out.println("Nama Saya: "+nama.getManusia());
        
        Biodata<Integer> umur = new Biodata<>();
        umur.setManusia(20);
        System.out.println("Usia Saya: "+umur.getManusia()+" Tahun");
        
        Biodata<Float> IPK = new Biodata<>();
        IPK.setManusia(3.5f);
        System.out.println("Nilai IPK Saya: "+IPK.getManusia());
        
        Biodata<Character> Karakter = new Biodata<>();
        Karakter.setManusia('N');
        System.out.println("Huruf Awalan Nama Saya Adalah: "+Karakter.getManusia());
        
    }
    
}
