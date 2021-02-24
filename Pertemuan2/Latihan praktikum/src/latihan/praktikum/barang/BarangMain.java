/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.praktikum.barang;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class BarangMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Barang b1 = new Barang();
        System.out.print("masukkan nama barang: ");
        b1.nama = in.next();
        System.out.print("Masukkan harga satuan: ");
        b1.hargaSatuan = in.nextInt();
        System.out.print("Masukkan jumlah barang: ");
        b1.jumlah = in.nextInt();
        System.out.println("Harga total : " +  b1.hitungHargaTotal());
        int diskon = b1.hitungDiskon();
        System.out.println("diskon : " + diskon);
        System.out.println("Harga Bayar : " +b1.hitungHargaBayar());
    }
}
