/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        System.out.println("==========================================================================");
        System.out.println("\t\t\t         MENU UTAMA");
        System.out.println("==========================================================================");
        System.out.println("PILIH MENU: ");
        System.out.println("1.Pangkat dengan Brute Force");
        System.out.println("2.pangkat dengan divide conquer");
        System.out.print("o> ");
        menu = sc.nextInt();
        
        System.out.println("==========================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();
        Pangkat[] png = new Pangkat[elemen];
        
        for (int i = 0; i < elemen; i++){
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan di pangkatkan ke- " +(i+1) + " : ");
            png[i].nilai=sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke- "+(i+1)+ " : ");
            png[i].pangkat=sc.nextInt();
        }   
            if (menu==1){
            System.out.println("==========================================");
            System.out.println("hasil pangkat dengan brute force");
            for (int i = 0; i < elemen; i++){
                System.out.println("Nilai "+png[i].nilai+ " pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
            }else if(menu==2){
            System.out.println("==========================================");
            System.out.println("Hasil pangkat dengan Divide and Conquer");
             for (int i = 0; i < elemen; i++){
                System.out.println("Nilai "+png[i].nilai+ " pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
            }
             System.out.println("==========================================");
    }
}
