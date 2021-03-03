/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanNo4;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainMahasiswa {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Jumlah Mahasiswa : ");
    int m = input.nextInt();
     Mahasiswa[] mhs = new Mahasiswa[m];
          
     for(int i=0;i<m;i++){
         mhs[i] = new Mahasiswa();
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
}

   
    

}

