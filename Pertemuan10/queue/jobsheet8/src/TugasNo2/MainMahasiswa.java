/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class MainMahasiswa {
     public static void menu(){
            System.out.println("Pilih Menu: ");
            System.out.println("1. Antrian Baru Mahasiswa");
            System.out.println("2. Antrian Keluar Mahasiswa");
            System.out.println("3. Cek Antrian Terdepan Mahasiswa");
            System.out.println("4. Cek antrian TerakhirMahasiswa");
            System.out.println("5. Cek Posisi Antrian mahasiswa");
            System.out.println("6. Posisi tertentu mahasiswa ");
            System.out.println("7. Cek Semua antrian");
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
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa P = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antri.Enqueue(P);
                    break;
                case 2:
                    Mahasiswa data = antri.Deuqueue();
                    if (!"".equals(data.nim)&& !"".equals(data.nama) && 
                            data.absen != 0 && data.ipk != 0){
                        System.out.println("Antrian yang keluar: " + data.nim + " " + data.nama
                        + " " + data.absen + " " + data.ipk);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nim : ");
                    String nm = sc.nextLine();
                    antri.peekPosition(nm);
                case 6:
                    antri.printMahasiswa(pilih);
                case 7:
                    antri.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
 
}
