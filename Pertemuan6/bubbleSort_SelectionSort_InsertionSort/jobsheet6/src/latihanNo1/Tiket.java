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
public class Tiket {
    public String maskapai;
    public int harga;
    public String asal;
    public String tujuan;
    
    Tiket(String m, int h,String a, String t ){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
    void tampilAll() {
        System.out.println("Team : "+maskapai);
        System.out.println("Play : "+harga);
        System.out.println("goal : "+asal);
        System.out.println("points : "+tujuan);
    
}
}
