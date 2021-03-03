/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanNo3;

/**
 *
 * @author HP
 */
public class modifTanah {
    public int panjang;
    public int lebar;
    public int maksimum=0;
    
    public modifTanah(){
        
    }

    
    
    public int hitungLuas(){
        return panjang*lebar;
    }
    public int tanahTerluas(int x, int y, int z){
        if(x>y && x>z){
            return 1;
        }else if(y>x && y>z){
            return 2;
        }else{
            return 3;
        }
           
         }
        
    }
    


    

