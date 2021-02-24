/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.praktikum;

/**
 *
 * @author HP
 */
public class mainLingkaran {
    public static void main(String[] args) {
        lingkaran1 l1= new lingkaran1();
        l1.phi = 3.14;
        l1.r = 4;
        double luasLingkaran = l1.hitungLuas();
        double kelilingLingkaran = l1.hitungKeliling() ;
        System.out.println("Luas lingkaran : " + luasLingkaran);
        System.out.println("Keliling Lingkaran : " + kelilingLingkaran);
    }
}
