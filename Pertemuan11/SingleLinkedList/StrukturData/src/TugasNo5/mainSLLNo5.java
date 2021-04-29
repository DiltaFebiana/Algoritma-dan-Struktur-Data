/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo5;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainSLLNo5 {
    static void menu(){
        System.out.println(" QUEUE NASABAH BANK DENGAN LINKED LIST");
        System.out.println("1. Tambah antrian nasabah dengan enqueue");
        System.out.println("2. Hapus antrian nasabah dengan Dequeue");
        System.out.println("3. Lihat antrian nasabah terdepan dengan PEEK");
        System.out.println("4. Mencari posisi antrian nasabah dengan peekPosition");
        System.out.println("5. Cetak daftar antrian ");
        System.out.println("6. Keluar Program");
        System.out.print("pilih : ");
    }
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        No5SLL s = new No5SLL();
        int pilih;
        do{
            menu();
            pilih = sc2.nextInt();
            switch (pilih){
                case 1:{
                    System.out.print("Masukkan No.Rekening\t: ");
                    String no = sc1.nextLine();
                    System.out.print("Masukkan Nama\t: ");
                    String nm = sc1.nextLine();
                    System.out.print("Masukkan Alamat\t: ");
                    String al = sc1.nextLine();
                    s.addLast(no, nm, al);
                    break;
                }case 2:{
                    s.removeFirst();
                    System.out.println("Berhasil Menghapus antrian nasabah");
                    break;
                }
                case 3:{
                    s.getDataHead();
                    break;
                }
                case 4:{
                    System.out.print("Masukkan nama yang dicari : ");
                    String key = sc1.nextLine();
                    s.getPosition(key);
                    break;
                }
                case 5:{
                    s.print();
                    break;
                } default:
                    if (pilih>5 && pilih < 6){
                        System.out.println("Pilihan Salah!!!");
                    }
                break;
}
            System.out.println("");
        }while(pilih!=6);
    }
}