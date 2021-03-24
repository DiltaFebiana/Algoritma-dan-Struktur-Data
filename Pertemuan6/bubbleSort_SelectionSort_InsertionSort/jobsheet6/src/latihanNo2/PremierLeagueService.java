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
public class PremierLeagueService {
    PremierLeague[] leagues = new PremierLeague[20];
    public int ind;
    
    public void tambah(PremierLeague t){
        if(ind<leagues.length){
            leagues[ind] = t;
            ind++;
        }else{
            System.out.println("Maaf Tidak Tersedia!!");
        }
    }
    public void tampilAll(){
       
        for(PremierLeague t : leagues){
            t.tampilAll();
            System.out.println("------------------------------------");
        }
    }
    public void insertionSort(boolean asc){
        for(int i=1; i<leagues.length; i++){
            PremierLeague temp = leagues[i];
            int j=i;
            if (asc){
           }else{
                
            }
            leagues[j] = temp;
            
    }
        System.out.println("====================================");
}
}
