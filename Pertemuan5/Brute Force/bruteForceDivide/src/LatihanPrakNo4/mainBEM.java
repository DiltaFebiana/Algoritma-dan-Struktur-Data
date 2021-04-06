/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPrakNo4;

/**
 *
 * @author Dilta Febiana
 */
import java.util.Scanner;
public class mainBEM {
    public static void main(String[] args) {
        Scanner scriz = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println(" Pemilihan Suara untuk Memilih Ketua BEM Tahun 2020 ");
        System.out.println("====================================================");
        pemilihanBEM pem = new pemilihanBEM();
        pemilihanBEM[] riz = new pemilihanBEM[pem.jumlahKandidat];
        
        for (int i = 0; i < pem.jumlahKandidat; i++) {
            riz[i] = new pemilihanBEM();
            System.out.print("Nama Kandidat ke- " + (i + 1) + " : ");
            riz[i].kandidat = scriz.nextLine();
        }
        System.out.println("===================================");
        for (int i = 0; i < pem.jumlahKandidat; i++) {
            System.out.print("Jumlah Suara Kandidat ke- " + (i + 1) + " : ");
            riz[i].suara = scriz.nextInt();
            pem.jumlahSuara += riz[i].suara;
        }
        System.out.println("==============================================================");
        int hasil = pem.hitungSuara(pem.jumlahSuara, riz[0].suara, riz[1].suara, riz[2].suara, riz[3].suara);
        if (hasil == 0) {
            System.out.println("Masing-masing Kandidat memiliki mayoritas yang hampir sama");
        } else {
            System.out.println("Ketua BEM yang terpilih adalah : " +riz[hasil-1].kandidat);
        }
    }
}
    
    