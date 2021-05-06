/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2_1H_DiltaFebiana;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainDLL {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();

        char pilih = 0;
        do {
            int menu, idx;
            String nim, nama, jurusan, prodi;
            double ipk;
            System.out.println("====================================");
            System.out.println("SISTEM PENGOLAHAN DATA MAHASISWA");
            System.out.println("====================================");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tambah Data Mahasiswa Posisi Akhir");
            System.out.println("3. Tambah Data Mahasiswa posisi awal");
            System.out.println("4. Hapus Data Mahasiswa");
            System.out.println("5. Hapus Data Mahasiswa posisi awal");
            System.out.println("6. Hapus Data Mahasiswa posisi akhir");
            System.out.println("7. Cetak Data Mahasiswa");
            System.out.println("8. Data Mahasiswa Urutan Pertama");
            System.out.println("9. Cari NIM Mahasiswa ");
            System.out.println("10.Urut Data IPK Mahasiswa");
            System.out.println("11.Keluar");
            System.out.println("====================================");
            System.out.print("Masukkan Pilihan Menu\t: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Masukkan Data Mahasiswa : ");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("Jurusan: ");
                    jurusan = sc.next();
                    System.out.print("Prodi: ");
                    prodi = sc.next();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    Mahasiswa d = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
                    System.out.print("Data Mahasiswa ini akan dimasukkan di indeks ke-");
                    idx = sc.nextInt();
                    dll.add(d,idx);
                    pilih = 'y';
                break;
                case 2:
                    System.out.println("Masukkan Data Mahasiswa Posisi Akhir : ");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("Jurusan: ");
                    jurusan = sc.next();
                    System.out.print("Prodi: ");
                    prodi = sc.next();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    Mahasiswa dt = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
                    dll.addLast(dt);
                    pilih = 'y';
                break;
                case 3:
                    System.out.println("Masukkan Data Mahasiswa Posisi Awal : ");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("Jurusan: ");
                    jurusan = sc.next();
                    System.out.print("Prodi: ");
                    prodi = sc.next();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    Mahasiswa data = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
                    dll.addFirst(data);
                    pilih = 'y';
                break;
                case 4:
                    System.out.print("Masukkan posisi indeks : ");
                    idx = sc.nextInt();
                    dll.remove(idx);
                    pilih = 'y';
                break;
                case 5:
                    dll.removeFirst();
                    pilih = 'y';
                break;
                case 6:
                    dll.removeLast();
                    pilih = 'y';
                break;
                case 7:
                    System.out.println("Cetak Data");
                    dll.print();
                    pilih = 'y';
                break;
                case 8:
                    System.out.println("----------------");
                    System.out.println("Cek Posisi Mahasiswa Teratas");
                    System.out.println("----------------");
                    dll.mahasiswaPertama();
                break;
                case 9:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan NIM yang dicari : ");
                    nim = input.nextLine();
                    dll.SeqSearch(nim);
                    pilih = 'y';
                break;
                case 10:
                    dll.bubbleSort();
                    System.out.println("Data berhasil diurutkan secara descending!");
                    pilih = 'y';
                break;
                case 11:
                    pilih = 'n';
                break;
            }
        } while (pilih == 'y');
    }
    
}
