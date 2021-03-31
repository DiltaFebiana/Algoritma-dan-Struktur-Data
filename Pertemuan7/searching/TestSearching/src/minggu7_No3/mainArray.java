/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7_No3;

/**
 *
 * @author HP
 */
import java.util.Scanner;
class mainArray {
    public static void main(String[] args) {
        
        int array[][] = {{45,78,7,200,80},{90,1,17,100,50},{21,2,40,18,65}};
            for(int i = 0; i < array.length; i++){
                for(int j = 0; j < array[0].length; j++){
                    System.out.print(array[i][j] + "|");
                }
                System.out.println("");
            }
        Scanner inp = new Scanner(System.in);
        
        array arr= new array();
        int cari;
      
        System.out.print("Data yang dicari: ");
        cari = inp.nextInt();
        int posisi=arr.FindSearch(array, cari);
        if(posisi == -1){
            System.out.println("Maaf data tidak ditemukan");
        }
    }
    
}
