/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author Dilta Febiana
 */
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Buku st = new Buku(8);
          Scanner sc = new Scanner(System.in);
          
        int menu;
        System.out.println("==========================================================================");
        System.out.println("\t\t\t         MENU OPERASI");
        System.out.println("==========================================================================");
        System.out.println("PILIH MENU: ");
        System.out.println("1.PUSH");
        System.out.println("2.POP");
	System.out.println("3.PEEK");
        System.out.println("4.PRINT");
        System.out.print("o> ");
        menu = sc.nextInt();
        if (menu == 1){
            char pilih;
          do{
              System.out.print("Judul: ");
              String judul = sc.next();
              System.out.print("Nama Pengarang: ");
              String nama = sc.next();
              System.out.print("Tahun Terbit: ");
              int tahun = sc.nextInt();
              System.out.print("Jumlah Halaman: ");
              int jml = sc.nextInt();
              System.out.print("Harga: ");
              int hrg = sc.nextInt();
              
              Buku bk = new Buku(judul, nama, tahun, jml, hrg);
              System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
              pilih = sc.next().charAt(0);
              sc.nextLine();
              st.push(bk);
          } while (pilih == 'y');
            
        } 
        else if (menu == 2){
             char pilih;
          do{
              System.out.print("Judul: ");
              String judul = sc.next();
              System.out.print("Nama Pengarang: ");
              String nama = sc.next();
              System.out.print("Tahun Terbit: ");
              int tahun = sc.nextInt();
              System.out.print("Jumlah Halaman: ");
              int jml = sc.nextInt();
              System.out.print("Harga: ");
              int hrg = sc.nextInt();
              
              Buku bk = new Buku(judul, nama, tahun, jml, hrg);
              System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
              pilih = sc.next().charAt(0);
              sc.nextLine();
              st.push(bk);
        }while (pilih == 'y');
          st.pop();
          }
        else if(menu == 3){
               char pilih;
          do{
              System.out.print("Judul: ");
              String judul = sc.next();
              System.out.print("Nama Pengarang: ");
              String nama = sc.next();
              System.out.print("Tahun Terbit: ");
              int tahun = sc.nextInt();
              System.out.print("Jumlah Halaman: ");
              int jml = sc.nextInt();
              System.out.print("Harga: ");
              int hrg = sc.nextInt();
              
              Buku bk = new Buku(judul, nama, tahun, jml, hrg);
              System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
              pilih = sc.next().charAt(0);
              sc.nextLine();
              st.push(bk);
          }while (pilih == 'y');
          st.peek();
          }
        else if(menu == 4){
              char pilih;
          do{
              System.out.print("Judul: ");
              String judul = sc.next();
              System.out.print("Nama Pengarang: ");
              String nama = sc.next();
              System.out.print("Tahun Terbit: ");
              int tahun = sc.nextInt();
              System.out.print("Jumlah Halaman: ");
              int jml = sc.nextInt();
              System.out.print("Harga: ");
              int hrg = sc.nextInt();
              
              Buku bk = new Buku(judul, nama, tahun, jml, hrg);
              System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
              pilih = sc.next().charAt(0);
              sc.nextLine();
              st.push(bk);
     }      while (pilih == 'y');
              st.pop();
              st.peek();
              st.print();
}
              
}
}
