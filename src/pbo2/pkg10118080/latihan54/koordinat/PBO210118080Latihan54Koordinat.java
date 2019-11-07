/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan54.koordinat;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat w= new WarnaKoordinat("Jingga", 10, 4);
        System.out.println("Warna Koordinat   : "+w.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+w.getX()+", y : "+w.getY());
    }
    
}
