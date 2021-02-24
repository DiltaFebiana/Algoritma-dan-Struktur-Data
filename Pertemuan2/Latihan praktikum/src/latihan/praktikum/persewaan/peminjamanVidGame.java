/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.praktikum.persewaan;

/**
 *
 * @author HP
 */
public class peminjamanVidGame {
    String namaMember, namaGame;
    int id, lamaPinjam, hargaSewa;
    
    void tampilData(){
        System.out.println("id : " + id);
        System.out.println("Nama member : " +namaMember);
        System.out.println("Nama Game : " +namaGame);
        System.out.println("Lama pinjam : " +lamaPinjam);
        System.out.println("Harga sewa : " +hargaSewa);
    }
    int hitungHargaBayar(){
        int hargaBayar =lamaPinjam*hargaSewa;
        return hargaBayar; 
    }
    
}
