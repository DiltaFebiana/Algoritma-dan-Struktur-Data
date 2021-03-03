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
public class Bola {
    public int jariJari;
    public double phi;
    
    public Bola(int r, double ph){
       jariJari=r;
       phi=ph;
    }

    Bola() {
   
    }

  
    public double luasPermukaan(){
        return 4*phi*jariJari*jariJari;
    }
    public double volume(){
        double vol=1.33;
        return vol*phi*jariJari;
    }
}
