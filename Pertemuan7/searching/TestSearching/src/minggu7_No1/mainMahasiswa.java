/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7_No1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainMahasiswa {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // numerik
        Scanner s1 = new Scanner(System.in); // alphabet / string

        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;

        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data Mahasiswa secara urut dari NIM terkecil");

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-------------------");
            System.out.print("NIM\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan ipk ");
        data.selectionSort();
        data.tampil();

        System.out.println("****");
        System.out.println("Pencarian Data");
        System.out.println("****");
        System.out.println("Masukkan NIM Mahasiswa yang Dicari : ");
        System.out.print("NIM : ");
        int cari = s.nextInt();

        System.out.println("======================================================");
        System.out.println("Menggunakan Binary Search");
        int posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);

        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}


