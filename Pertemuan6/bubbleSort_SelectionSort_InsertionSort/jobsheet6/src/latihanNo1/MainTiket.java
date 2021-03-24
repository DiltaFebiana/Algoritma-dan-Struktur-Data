/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanNo1;

/**
 *
 * @author HP
 */
public class MainTiket {
    public static void main(String[] args) {
        TiketService list = new TiketService();
        Tiket t1 = new Tiket("Garuda Indonesia", 1418700, "Jakarta", "surabaya");
        Tiket t2 = new Tiket("Lion Air", 472800, "Surabaya", "Jakarta");
        Tiket t3 = new Tiket("Wing Air",644000, "Surabaya", "Denpasar");
        Tiket t4 = new Tiket("Sriwijaya Air", 421000, "Jakarta", "surabaya");
        Tiket t5 = new Tiket("Kal Star", 613000, "Denpasar", "surabaya");
        Tiket t6 = new Tiket("Express Air", 416000, "Medan", "Yogyakarta");
        Tiket t7 = new Tiket("Citilink", 732500, "Medan", "Bandung");
        Tiket t8 = new Tiket("Transnusa", 674200, "Solo", "Palembang");
        Tiket t9 = new Tiket("Batik Air", 1084300, "Manokwari", "surabaya");
        Tiket t10 = new Tiket("Air Asia", 1170000, "Lampung", "Yogyakarta");
        Tiket t11 = new Tiket("Sky Aviation",655600 , "Manokwari", "surabaya");
        
        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
        list.tambah(t6);
        list.tambah(t7);
        list.tambah(t8);
        list.tambah(t9);
        list.tambah(t10);
        list.tambah(t11);
        
        System.out.println("Daftar Tiket Pesawat sebelum di Sorting");
        list.tampilAll();
        
        System.out.println("Daftar Tiket Pesawat Setelah di Sorting");
        list.bubbleSort();
        list.tampilAll();
        
        System.out.println("Daftar Tiket Pesawat Setelah Di sorting ");
        list.selectionSort();
        list.tampilAll();
    
    }
}
