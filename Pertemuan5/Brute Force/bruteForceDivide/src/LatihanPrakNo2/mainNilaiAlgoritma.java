/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPrakNo2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainNilaiAlgoritma {
     public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int n = Input.nextInt();
     
        NilaiAlgoritma[] nil = new NilaiAlgoritma[n];
        for (int i = 0; i < n; i++){
        nil[i] = new NilaiAlgoritma();
        
        System.out.print("Nama\t\t : ");
        nil[i].NamaMhs = Input.next();
        System.out.print("Nilai Tugas\t : ");
        nil[i].nilaiTugas = Input.nextInt();
        System.out.print("Nilai Kuis\t : ");
        nil[i].nilaiKuis = Input.nextInt();
        System.out.print("Nilai UTS\t : ");
        nil[i].nilaiUTS = Input.nextInt();
        System.out.print("Nilai UAS\t : ");
        nil[i].nilaiUAS = Input.nextInt();
        System.out.println("----------------------------------------------------");
        }
        for (int i = 0; i < n; i++){
        System.out.println("====================================================");
        System.out.println("|| Nama\t\t : " + nil[i].NamaMhs);
        System.out.println("|| Nilai Total\t : " + nil[i].hitungTotalNilai());
        System.out.println("====================================================");
    }
     }
}

