/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo3;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainDLL {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        int pilih;
    do{
        System.out.println("----------------------------");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGAZA");
        System.out.println("----------------------------");
        System.out.println(" 1. Tambah Data Penerima Vaksin");
        System.out.println(" 2. Hapus Data Pengantri vaksin");
        System.out.println(" 3. Daftar Penerima Vaksin");
        System.out.println(" 4. Keluar");
        System.out.print("o> ");
        pilih = sc.nextInt();
        switch (pilih){
            case 1:
                System.out.println("Nomor Antrian: ");
                String no = sc.next();
                System.out.println("Nama Penerima: ");
                String nama = sc.next();
                dll.addLast(no, nama);
                break;
            case 2:
                dll.removeFirst();
                break;
            case 3:
                System.out.println("Daftar Penerima Vaksin");
                dll.print();
                break;
            default:
        }
        }while (pilih == 1 || pilih == 2 || pilih == 3);
        
    }
}
