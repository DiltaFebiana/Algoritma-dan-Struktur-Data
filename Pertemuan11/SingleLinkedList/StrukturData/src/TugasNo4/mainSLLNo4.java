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
public class mainSLLNo4 {
    static void menu(){
        System.out.println("============== MENU NASABAH =============");
        System.out.println("1. Tambah nasabah add first()");
        System.out.println("2. Tambah nasabah add last()");
        System.out.println("3. Tambah nasabah insertAfter()");
        System.out.println("4. Tambah nasabah insertAt()");
        System.out.println("5. Hapus Nasabah dengan removeFirst()");
        System.out.println("6. Hapus nasabah dengan removelast()");
        System.out.println("7. Hapus nasabah dengan remove()");
        System.out.println("8. Hapus nasabah dengan removeAt()");
        System.out.println("9. Cetak semua data nasabah");
        System.out.println("10. Keluar Program");
        System.out.print("pilih : ");
    }
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        No4SLL s = new No4SLL();
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
                    s.addFirst(no, nm, al);
                    break;
                }case 2:{
                    System.out.print("Masukkan No.Rekening\t: ");
                    String no = sc1.nextLine();
                    System.out.print("Masukkan Nama\t: ");
                    String nm = sc1.nextLine();
                    System.out.print("Masukkan Alamat\t: ");
                    String al = sc1.nextLine();
                    s.addLast(no, nm, al);
                    break;
                }
                case 3:{
                    System.out.print("Masukkan Key (nama/no.rek) : ");
                    String key = sc1.nextLine();
                    System.out.print("Masukkan No.Rekening\t: ");
                    String no = sc1.nextLine();
                    System.out.print("Masukkan Nama\t: ");
                    String nm = sc1.nextLine();
                    System.out.print("Masukkan Alamat\t: ");
                    String al = sc1.nextLine();
                    s.insertAfter (key, no, nm, al);
                    break;
                }
                case 4:{
                    System.out.print("Masukkan Indeks\t :");
                    int idx = sc2.nextInt();
                    System.out.print("Masukkan No.Rekening\t: ");
                    String no = sc1.nextLine();
                    System.out.print("Masukkan Nama\t: ");
                    String nm = sc1.nextLine();
                    System.out.print("Masukkan Alamat\t: ");
                    String al = sc1.nextLine();
                    s.insertAt (idx, no, nm, al);
                    break;
                }
                case 5:{
                    s.removeFirst();
                    System.out.println("Berhasil Menghapus Nasabah! ");
                    break;
                }
                case 6:{
                    s.removeLast();
                    System.out.println("Berhasil terhapus");
                    break;
                }
                case 7:{
                    System.out.print("Masukkan Key (nama/no.Rek) : ");
                    String key = sc1.nextLine();
                    s.remove(key);
                    System.out.println("Berhasil Menghapus");
                    break;
                }
                case 8:{
                    System.out.print("Masukkan Index : ");
                    int idx = sc2.nextInt();
                    s.removeAt(idx);
                    System.out.println("Berhasil Menghapus");
                    break;
                }
                case 9:{
                    s.print();
                    break;
                }default :
                    if (pilih > 9 && pilih <10){
                        System.out.println("Pilihan salah!!");
                    }
                break;
            }
            System.out.println("");
        }while(pilih != 10);
    }
}
