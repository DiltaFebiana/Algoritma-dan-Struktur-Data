/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author Dilta Febiana
 */
import java.util.Scanner;
public class mainfaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        faktorial[] fk= new faktorial[elemen];
        for (int i=0; i<elemen;i++){
            fk[i]=new faktorial();
            System.out.print("Masukkan nilai ke- "+ (i+1)+ " :");
            fk[i].nilai = sc.nextInt();
            
    }
        System.out.println("----------------------------");
        System.out.println("Hasil Faktorial Dengan Brute Force");
        for (int i=0; i<elemen;i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai+ " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("----------------------------");
        System.out.println("Hasil Faktorial dengan Divide Conquer");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai+ " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("================================");
    }
}
