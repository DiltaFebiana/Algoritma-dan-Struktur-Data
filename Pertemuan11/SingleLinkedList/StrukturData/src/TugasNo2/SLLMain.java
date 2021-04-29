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
public class SLLMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList singLL = new SingleLinkedList();
        String data, data2;
        int pilih;
        do {
            System.out.println("=======================");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data setelah posisi tertentu");
            System.out.println("4. Tambah data sebelum posisi tertentu");
            System.out.println("=======================");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();

                if(pilih == 1){
                    System.out.print("Data : ");
                    data = sc.nextLine();
                    singLL.addFirst(data);
                    singLL.print();
                    
                }
                else if(pilih == 2){ 
                    System.out.print("Data : ");
                    data = sc.nextLine();
                    singLL.addLast(data);
                    singLL.print();
                   
                        }
                else if(pilih == 3){
                    System.out.print("Data : ");
                    data = sc.nextLine();
                    System.out.print("Data setelah: ");
                    data2 = sc.nextLine();
                    singLL.insertAfter(data2, data);
                    singLL.print();
                    
                }
                else if(pilih == 4){
                    System.out.print("Data : ");
                    data = sc.nextLine();
                    System.out.print("Data sesudah: ");
                    data2 = sc.nextLine();
                    singLL.insertBefore(data2, data);
                    singLL.print();
                   
                }
            }
        while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
     }
}


