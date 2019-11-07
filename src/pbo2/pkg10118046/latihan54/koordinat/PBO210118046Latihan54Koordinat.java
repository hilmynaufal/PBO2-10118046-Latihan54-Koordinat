/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan54.koordinat;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : memasukkan warna koordinat dengan konstruktor
 */
public class PBO210118046Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        WarnaKoordinat warnakoordinat = new WarnaKoordinat("Jingga", 10, 4);
        System.out.println("Warna Koordinat: " + warnakoordinat.getNamaWarna());
        System.out.println("Koordinat sumbu x: " + warnakoordinat.getX() + ", y: " + warnakoordinat.getY());
    }

}
