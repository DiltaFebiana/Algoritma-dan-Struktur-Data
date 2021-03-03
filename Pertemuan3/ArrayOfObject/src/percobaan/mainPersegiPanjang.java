/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainPersegiPanjang {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Panjang Array: ");
    int m = sc.nextInt();
    persegiPanjang[] ppArray = new persegiPanjang[m];
    
    for(int i=0; i < ppArray.length; i++){
        ppArray[i]=new persegiPanjang();
        System.out.println("Persegi panjang ke-" + i);
        System.out.print("masukkan panjang: ");
        ppArray[i].panjang=sc.nextInt();
        System.out.print("masukkan lebar: ");
        ppArray[i].lebar=sc.nextInt();
    }
    for(int i =0; i<ppArray.length;i++){
        System.out.println("Persegi panjang ke-" + i);
        System.out.println("panjang: " +ppArray[i].panjang+", lebar: "+ppArray[i].lebar);
        
    }
    }
    
}
