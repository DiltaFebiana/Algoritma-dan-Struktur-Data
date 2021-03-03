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
public class Kubus {
    public int sisi;
    
    public Kubus(int s){
        sisi = s;
    }

    Kubus() {
        
    }

   
    public int luasPermukaan(){
        return 6*sisi*sisi;
    }
    public int volume(){
        return sisi*sisi*sisi;
    }
}
