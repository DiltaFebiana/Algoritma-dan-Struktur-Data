/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.praktikum.barang;

/**
 *
 * @author HP
 */
public class Barang {
    String nama;
    int hargaSatuan, jumlah;
    
    int hitungHargaTotal(){
        int hargaTotal = hargaSatuan*jumlah;
        return hargaTotal;
    }
    int hitungDiskon(){
        double diskon=0;
        if(hitungHargaTotal() > 100000){
           diskon =0.1;
           return (int) (diskon*hitungHargaTotal());
        }else if(hitungHargaTotal() >= 50000 && hitungHargaTotal() <= 100000){
            diskon = 0.05;
            return (int) (diskon * hitungHargaTotal());
        }else {
            return 0;
        }
        
    }
    
    int hitungHargaBayar(){
        return this.hitungHargaTotal()-this.hitungDiskon();
    }
}
   
