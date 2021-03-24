/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanNo2;

/**
 *
 * @author HP
 */
public class mainLeague {
    public static void main(String[] args) {
        PremierLeagueService cek = new PremierLeagueService();
        PremierLeague t1 = new PremierLeague("Liverpool", 29, 45, 82);
        PremierLeague t2 = new PremierLeague("Manchester City", 27, 39, 57);
        PremierLeague t3 = new PremierLeague("Leicester", 28, 26, 50);
        PremierLeague t4 = new PremierLeague("Chelsea", 29, 9, 48);
        PremierLeague t5 = new PremierLeague("Wolverhampton Wanderes", 29, 7, 43);
        PremierLeague t6 = new PremierLeague("Sheffield United", 28, 5, 43);
        PremierLeague t7 = new PremierLeague("Manchester United",28, 45, 82);
        PremierLeague t8 = new PremierLeague("Tottenham Hotspur", 29, 7, 41);
        PremierLeague t9 = new PremierLeague("Arsenal", 28, 4, 40);
        PremierLeague t10 = new PremierLeague("Burnley", 29, -6, 39);
        PremierLeague t11 = new PremierLeague("Crystal palace", 29, -6, 39);
        PremierLeague t12 = new PremierLeague("Everton", 29, -6, 37);
        PremierLeague t13 = new PremierLeague("Newcastle United", 29, -16, 35);
        PremierLeague t14 = new PremierLeague("Southampton", 29, -17, 34);
        PremierLeague t15 = new PremierLeague("Brighton & Hove Albion", 29, -8, 29);
        PremierLeague t16 = new PremierLeague("West Ham United", 29, -15, 27);
        PremierLeague t17 = new PremierLeague("Watford", 29, -17, 27);
        PremierLeague t18 = new PremierLeague("AFC Bournemouth", 29, -18, 27);
        PremierLeague t19 = new PremierLeague("Aston Villa", 27, -18, 25);
        PremierLeague t20 = new PremierLeague("Norwich City", 29, -27, 21);
        
        cek.tambah(t1);
        cek.tambah(t2);
        cek.tambah(t3);
        cek.tambah(t4);
        cek.tambah(t5);
        cek.tambah(t6);
        cek.tambah(t7);
        cek.tambah(t8);
        cek.tambah(t9);
        cek.tambah(t10);
        cek.tambah(t11);
        cek.tambah(t12);
        cek.tambah(t13);
        cek.tambah(t14);
        cek.tambah(t15);
        cek.tambah(t16);
        cek.tambah(t17);
        cek.tambah(t18);
        cek.tambah(t19);
        cek.tambah(t20);
        
        
        
        System.out.println("Data Premier league setelah sorting ");
        cek.insertionSort(true);
        cek.tampilAll();
        
    }
}
