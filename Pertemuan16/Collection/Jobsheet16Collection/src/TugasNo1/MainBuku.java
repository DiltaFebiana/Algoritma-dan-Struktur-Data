/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo1;

/**
 *
 * @author HP
 */
import java.util.*;
public class MainBuku {
    static void menu(){
        System.out.println("********************");
            System.out.println("Data Buku Perpusatakaan");
            System.out.println("********************");
            System.out.println("1. Entry Judul Buku");
            System.out.println("2. Ambil Buku Teratas");
            System.out.println("3. Cek Buku Teratas");
            System.out.println("4. Info Semua Judul Buku");
            System.out.println("5. Keluar");
            System.out.println("********************");
            System.out.print("Pilih: ");
    }
     public static void main(String[] args) throws Exception {

        Stack<Buku> buku = new Stack<Buku>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int pilih;
        
        Buku b1 = new Buku("001", "3D Computer Vision", "2010", "Magna PC");
        Buku b2 = new Buku("002", "Understanding Software", "201", "Est Foundtion");
        Buku b3 = new Buku("003", "Algoritma Notes For Professional", "2012", "Turpis Net LLC");
        Buku b4 = new Buku("004", "Getting Started with C++ Audio Programming For Game Developer", "2013", "Est Foundtion");
        Buku b5 = new Buku("005", "Practical digital forencis", "2014", "Eu LLC");
        
        buku.push(b1);
        buku.push(b2);
        buku.push(b3);
        buku.push(b4);
        buku.push(b5);
        
        do {
            menu();

            pilih = sc.nextInt();
            if (pilih == 1) {
                System.out.println("");
                String entry = sc.nextLine();
                System.out.print("Isbn\t : ");
                String isbn = sc.nextLine();
                System.out.print("Judul\t : ");
                String judul = sc.nextLine();
                System.out.print("Terbit\t : ");
                String terbit = sc.nextLine();
                System.out.print("Penerbit : ");
                String penerbit = sc.nextLine();
                Buku b = new Buku();
                buku.push(b = new Buku(isbn, judul, terbit, penerbit));
            }
            if (pilih == 2) {
                
                buku.pop();
            }
            if (pilih == 3) {
                System.out.println("Buku{" + "isbn=" + (buku.get(buku.size() - 1).isbn) + ", " + "judul=" + (buku.get(buku.size() - 1).judul)
               + ", " + "Terbit=" + (buku.get(buku.size() - 1).terbit) + ", " + "" + "Penerbit=" + (buku.get(buku.size() - 1).penerbit) + '}');
            }
            if (pilih == 4) {
                buku.stream().forEach(b -> {
                    System.out.println("Buku{" + "isbn=" + b.isbn + ", " + "judul=" + b.judul + ", " 
                            + "terbit=" + b.terbit + ", " + "penerbit=" + b.penerbit + '}');
                });
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
