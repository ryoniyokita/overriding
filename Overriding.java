/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author ASUS
 */
class saya{
    public void biodata(){
    String nama ="ayu";
    String alamat ="denpasar";
    String hobi ="membaca";
    System.out.println("Biodata saya: ");
    System.out.println("Nama saya: "+(nama));
    System.out.println("Alamat saya: "+(alamat));
    System.out.println("Hobi saya: "+(hobi));
    }
}
class teman extends saya{
    public void biodata(){
    String nama ="ari";
    String alamat ="bandung";
    String hobi ="menulis";
    System.out.println("Biodata Teman: ");
    System.out.println("Nama saya: "+(nama));
    System.out.println("Alamat saya: "+(alamat));
    System.out.println("Hobi saya: "+(hobi));
    }
}
        
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        saya s = new saya();
        teman t = new teman();
        
        s.biodata();
        t.biodata();
        
    }
    
}
