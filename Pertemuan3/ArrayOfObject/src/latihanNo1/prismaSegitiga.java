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
public class prismaSegitiga {
    public int alas;
    public int tinggi;
    public int tinggiPrisma;
    public double kelilingalas;
    public double luasAlas;
    
    public prismaSegitiga(){
        
    }
    public double volume(){
        return ((alas*tinggi)/2)*tinggiPrisma;
    }
    public double luasPermukaan(){
        return (2*luasAlas)+(kelilingalas*tinggiPrisma);
    }
      
}
