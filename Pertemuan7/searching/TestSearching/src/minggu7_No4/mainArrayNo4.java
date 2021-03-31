 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7_No4;

/**
 *
 * @author Dilta Febiana
 */
import java.util.Scanner;
public class mainArrayNo4 {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        
        int array1D[] = new int[0];
        pencarianArray listArr = new pencarianArray();
        
        array1D a0 = new array1D(12);
        array1D a1 = new array1D(17);
        array1D a2 = new array1D(2);
        array1D a3 = new array1D(1);
        array1D a4 = new array1D(70);
        array1D a5 = new array1D(50);
        array1D a6 = new array1D(90);
        array1D a7 = new array1D(17);
        array1D a8 = new array1D(2);
        array1D a9 = new array1D(90);
        
        listArr.tambah(a0);
        listArr.tambah(a1);
        listArr.tambah(a2);
        listArr.tambah(a3);
        listArr.tambah(a4);
        listArr.tambah(a5);
        listArr.tambah(a6);
        listArr.tambah(a7);
        listArr.tambah(a8);
        listArr.tambah(a9);
        
        System.out.println("--------------------------------------------");
        System.out.println("Data keseluruhan Angka");
        listArr.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan nilai pada Array ");
        listArr.SelectionSort();
        listArr.tampil();

        System.out.println("*********************************************");
        System.out.println("Pencarian nilai Array");
        System.out.println("*********************************************");
        System.out.println("Data yang dicari: ");
        int cari = input.nextInt();
        System.out.println("Menggunakan Binary Search");
        int posisi = listArr.FindBinarySearch(cari, 0, 9);
        listArr.TampilData(cari, posisi);
        listArr.tampilIndex(cari,posisi);
        
        System.out.println("=============================================");
        System.out.println("                  Nilai Maksimal             ");
        System.out.println("=============================================");
        listArr.dataMaks();
}
}

