/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPrakNo1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainNilaiAlgoritma {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        NilaiAlgoritma nil = new NilaiAlgoritma();
        System.out.print("Nama\t\t : ");
        nil.NamaMhs = Input.nextLine();
        System.out.print("Nilai Tugas\t : ");
        nil.nilaiTugas = Input.nextInt();
        System.out.print("Nilai Kuis\t : ");
        nil.nilaiKuis = Input.nextInt();
        System.out.print("Nilai UTS\t : ");
        nil.nilaiUTS = Input.nextInt();
        System.out.print("Nilai UAS\t : ");
        nil.nilaiUAS = Input.nextInt();
        
        System.out.println("====================================================");
        System.out.println("|| Nilai Total : " + nil.hitungTotalNilai());
        System.out.println("====================================================");
    }
    
}
