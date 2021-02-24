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
public class peminjamanMain {
    public static void main(String[] args) {
        
    
    peminjamanVidGame p1 = new peminjamanVidGame();
    p1.id = 2034;
    p1.namaMember = "Silver";
    p1.namaGame = "mobile legend";
    p1.lamaPinjam = 5 ;
    p1.hargaSewa = 15000;
    int hitungBayar = p1.hitungHargaBayar();
    System.out.println(" Harga yang harus dibayar : " +hitungBayar);
    }
}
