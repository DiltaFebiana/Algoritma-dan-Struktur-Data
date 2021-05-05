/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo4;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainNo4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        doubleLinkedList dll = new doubleLinkedList();

        char pilih = 0;
        do {
            int menu, idx;
            String nim, nama;
            double ipk;
            System.out.println("====================================");
            System.out.println("SISTEM PENGOLAHAN DATA MAHASISWA");
            System.out.println("====================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akir");
            System.out.println("3. Tambah Data Indeks Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari NIM");
            System.out.println("9. Urut Data IPK-DESC");
            System.out.println("10.Keluar");
            System.out.println("====================================");
            System.out.print("Masukkan Pilihan Menu\t: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Masukkan Data Mahasiswa Posisi Awal : ");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    Mahasiswa data = new Mahasiswa(nim, nama, ipk);
                    dll.addFirst(data);
                    pilih = 'y';
                break;
                case 2:
                    System.out.println("Masukkan Data Mahasiswa Posisi Akhir : ");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    Mahasiswa dt = new Mahasiswa(nim, nama, ipk);
                    dll.addLast(dt);
                    pilih = 'y';
                break;
                case 3:
                    System.out.println("Masukkan Data Mahasiswa");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    Mahasiswa d = new Mahasiswa(nim, nama, ipk);
                    System.out.print("Data Mahasiswa ini akan dimasukkan di indeks ke-");
                    idx = sc.nextInt();
                    dll.add(d,idx);
                    pilih = 'y';
                break;
                case 4:
                    dll.removeFirst();
                    pilih = 'y';
                break;
                case 5:
                    dll.removeLast();
                    pilih = 'y';
                break;
                case 6:
                    System.out.print("Masukkan posisi indeks : ");
                    idx = sc.nextInt();
                    dll.remove(idx);
                    pilih = 'y';
                break;
                case 7:
                    System.out.println("Cetak Data");
                    dll.print();
                    pilih = 'y';
                break;
                case 8:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan NIM yang dicari : ");
                    nim = input.nextLine();
                    dll.cariData(nim);
                    pilih = 'y';
                break;

                case 9:
                    dll.sortLinkedList();
                    System.out.println("Data berhasil diurutkan secara descending!");
                    pilih = 'y';
                break;
                case 10:
                    pilih = 'n';
                break;
            }
        } while (pilih == 'y');
    }
    
}
