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
public class array {
    array arr[][] = new array[3][5];
 
public int FindSearch( int array[][],int cari){
        int posisi = -1; 
        int posisi1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j=0; j < arr[0].length; j++){
                if (array[i][j]==cari) {
                    posisi1=i;
                    posisi=j;
                    System.out.println("nilai : " + cari + " ada pada indeks ke- " + posisi1 + " kolom ke- " + posisi);
            
                }
            }
        }
        return posisi;
     }


}


   
    

