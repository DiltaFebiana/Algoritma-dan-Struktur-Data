/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanNo5;

/**
 *
 * @author HP
 */
import LatihanNo4.Mahasiswa;
import java.util.Scanner;
public class mainModifMHS {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Jumlah Mahasiswa : ");
    int m = input.nextInt();
    modifMahasiswa[] mhs = new modifMahasiswa[m];
          
     for(int i=0;i<m;i++){
         mhs[i] = new modifMahasiswa();
         System.out.println("Masukkan data mahasiswa ke- " + (i+1));
         System.out.print("Masukkan nama : ");
         mhs[i].nama = input.next();
         System.out.print("Masukkan NIM : ");
         mhs[i].nim = input.next();
         System.out.print("Masukkan Jenis Kelamin : ");
         mhs[i].jenisKelamin = input.next().charAt(0);
         System.out.print("Masukkan IPK : ");
         mhs[i].ipk = input.nextDouble();
     }
        System.out.println("---------------------------");
     for(int i=0;i<m; i++){
         System.out.println("Nama: "+mhs[i].nama);
         System.out.println("NIM: "+mhs[i].nim);
         System.out.println("Jenis Kelamin: "+mhs[i].jenisKelamin);
         System.out.println("IPK: "+mhs[i].ipk);
     }
         System.out.println();
         modifMahasiswa rata = new modifMahasiswa();
         System.out.println("IPK Rata-rata seluruh mahasiswa: " + rata.rataRata(mhs[0].ipk, mhs[1].ipk, mhs[2].ipk));
}

   
    

}
    
 
