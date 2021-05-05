/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainDLL {
     public static void menu(){
        System.out.println("----------------------");
        System.out.println("DATA BUKU PERPUSTAKAAN");
        System.out.println("----------------------");
        System.out.println(" 1. Entry Judul Buku");
        System.out.println(" 2. Ambil Buku Teratas");
        System.out.println(" 3. Cek Judul Buku Teratas");
        System.out.println(" 4. Info semua Judul Buku");
        System.out.println(" 5. Keluar");
        System.out.print("o> ");
 
 }
 public static void main(String args[])throws Exception{
    Scanner sc=new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);
    doubleLinkedList dll=new doubleLinkedList();
    dll.addLast("3D Computer vision");
    dll.addLast("Understanding Software");
    dll.addLast("Algorithms Noter for Professional");
    dll.addLast("Getting Started witch C++ Audio Programing for Game Development");
    int pilih=0;
    do{
        menu();
        pilih=sc.nextInt();
        switch(pilih){
                case 1:{
                System.out.println("----------------------");
                System.out.println("Masukkan judul buku");
                System.out.println("----------------------");
                String judul=sc1.nextLine();
                dll.addLast(judul);
                break;
             } case 2:{
                dll.removeFirst();
                System.out.println("----------------------------------------");
                System.out.println("Buku pada tumpukan teratas telah diambil");
                System.out.println("----------------------------------------");
                break;
             } case 3:{
                System.out.println("----------------");
                System.out.println("Cek Buku Teratas");
                System.out.println("----------------");
                System.out.println(dll.getFirst());
                break;
             } case 4:{
                System.out.println("------------------------");
                System.out.println("Cetak Seluruh Judul Buku");
                System.out.println("------------------------");
                dll.print();
                break;
             } default:{
                if(pilih>5||pilih<0){
                System.out.println("Pilihan anda salah!");
                break;
                } else{
                break; }
 }
 }
 }     while(pilih!=0);
 }
}
