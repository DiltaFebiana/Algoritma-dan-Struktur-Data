/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPrakNo3;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainNilaiAlgoritma {
    public static void main(String[] args) {
        	Scanner in = new Scanner (System.in);
		System.out.print("Masukan jumlah mahasiswa :");
		int n =in.nextInt();
		NilaiAlgoritma[] array = new NilaiAlgoritma[n];
		for (int i=0;i<n;i++){
		array[i] =new NilaiAlgoritma();
		System.out.print("Masukan nama mahasiswa : ");
		array[i].namaMHS =in.next ();
		System.out.print("Masukan nilai tugas :");
		array[i].tugas =in.nextInt();
		System.out.print("Masukan nilai quiz :");
		array[i].kuis =in.nextInt();
		System.out.print("Masukan nilai uts :");
		array[i].uts=in.nextInt();
		System.out.print("Masukan nilai uas :");
		array[i].uas=in.nextInt();
		System.out.println("-------------------------------------------");
	}
                NilaiAlgoritma sc = new NilaiAlgoritma();
                for (int i=0;i<n;i++){
                System.out.println("--------------------------------------------");
		System.out.println("Nama mahasiswa :"+array[i].namaMHS+":"+sc.hitungNilaiTotal(array[i].tugas,
			array[i].kuis,array[i].uts,array[i].uas));
	}
                System.out.println("==========================================");
                System.out.println("rata-rata :"+ sc.rataNilai(n));
	}
    }
    

