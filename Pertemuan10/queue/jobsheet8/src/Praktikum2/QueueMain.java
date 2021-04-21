/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;
 
/**
 *
 * @author HP
 */  
import java.util.Scanner;
public class QueueMain {
        public static void menu(){
            System.out.println("Pilih Menu: ");
            System.out.println("1. Antrian Baru");
            System.out.println("2. Antrian Keluar");
            System.out.println("3. Cek Antrian Terdepan");
            System.out.println("4. Cek antrian Terakhir");
            System.out.println("4. Cek Semua antrian");
            System.out.println("-----------------------------------");
        }
       public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Masukkan kapasitas Queue: ");
        int jumlah = sc.nextInt();
         Queue antri = new Queue(jumlah);
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kota Asal: ");
                    String asal = sc.nextLine();
                    System.out.print("Kota Tujuan: ");
                    String tujuan = sc.nextLine();
                    System.out.print("Jumlah Tiket: ");
                    int jml = sc.nextInt();
                    System.out.print("Harga: ");
                    int hrg = sc.nextInt();
                    Penumpang P = new Penumpang(nama, asal, tujuan, jml, hrg);
                    sc.nextLine();
                    antri.Enqueue(P);
                    break;
                case 2:
                    Penumpang data = antri.Deuqueue();
                    if (!"".equals(data.nama)&& !"".equals(data.kotaAsal) && !"".equals(data.kotaTujuan) && 
                            data.jumlahTiket != 0 && data.harga != 0){
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.kotaAsal + " " + data.kotaTujuan
                        + " " + data.jumlahTiket + " " + data.harga);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    antri.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
 
}
