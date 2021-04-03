/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS1H;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class fungsiMain {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        int menu;
        System.out.println("==========================================================================");
        System.out.println("\t\t\t         MENU UTAMA");
        System.out.println("==========================================================================");
        System.out.println("PILIH MENU: ");
        System.out.println("1.Tampil Data Rekening");
        System.out.println("2.tampil Data Transaksi");
	System.out.println("3.Mencari Saldo");
        System.out.println("4.Mencari nama ");
        System.out.println("5.Keluar");
        System.out.print("o> ");
        menu = Input.nextInt();
        
        
        sistemBank rek = new sistemBank();
        Rekening r1 = new Rekening("161006170573","bin Abdul Salam","Ariffin","13578430547","nec@lectusjusto.org");
        Rekening r2 = new Rekening("162404012243","bin Mail","Ismail","5717062","convallis@Vestibulumanteipsum.org");
        Rekening r3 = new Rekening("162705250112","Singh","Jarjit","6230234","porttitor.tellus.non@Curabitur.ca");
        Rekening r4 = new Rekening("164603294259","bin Khamis","Isnin","8977608","pede.Suspendisse.dui@a.ca");
        Rekening r5 = new Rekening("163204213437","Xiao","Mei Mei","7924447","non@mus.com");
        
    }
}
