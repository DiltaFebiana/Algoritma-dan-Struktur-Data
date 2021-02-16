/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Tugasno1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bayarAni = 0,bayarBudi = 0,bayarBina = 0,bayarCita = 0,berat,totalPendapat;
        double diskon=0.05;
        int tarif=4500;
        
        System.out.println(" Ani: ");
        System.out.print("Berat pakaian: ");
        berat=input.nextInt();
        if(berat>10){
             bayarAni = (int) (berat*tarif*0.05);
            System.out.println("Jadi yang harus dibayar adalah " + bayarAni); 
        }else if(berat<10){
            bayarAni = berat*tarif;
            System.out.println("Jadi yang harus dibayar adalah " + bayarAni); 
            System.out.println("Maaf anda tidak mendapat diskon");
        }
        System.out.println("----------------------------------------");
       System.out.println(" Budi: ");
        System.out.print("Berat pakaian: ");
        berat=input.nextInt();
        if(berat>10){
             bayarBudi = (int) (berat*tarif*0.05);
            System.out.println("Jadi yang harus dibayar adalah " + bayarBudi); 
        }else if(berat<10){
            bayarBudi = berat*tarif;
            System.out.println("Jadi yang harus dibayar adalah " + bayarBudi); 
            System.out.println("Maaf anda tidak mendapat diskon");
        }
        System.out.println("-----------------------------------------");
        System.out.println(" Bina: ");
        System.out.print("Berat pakaian: ");
        berat=input.nextInt();
        if(berat>10){
             bayarBina = (int) (berat*tarif*0.05);
            System.out.println("Jadi yang harus dibayar adalah " + bayarBina); 
        }else if(berat<10){
            bayarBina = berat*tarif;
            System.out.println("Jadi yang harus dibayar adalah " + bayarBina); 
            System.out.println("Maaf anda tidak mendapat diskon");
 
}       System.out.println("-----------------------------------------");
        System.out.println(" Cita: ");
        System.out.print("Berat pakaian: ");
        berat=input.nextInt();
        if(berat>10){
             bayarCita = (int) (berat*tarif*0.05);
            System.out.println("Jadi yang harus dibayar adalah " + bayarCita); 
        }else if(berat<10){
            bayarCita = berat*tarif;
            System.out.println("Jadi yang harus dibayar adalah " + bayarCita); 
            System.out.println("Maaf anda tidak mendapat diskon");
}System.out.println("-------------------------------------------------  + ");
      totalPendapat=(bayarAni+bayarBudi+bayarBina+bayarCita);
        System.out.println("Jadi Total Pendapat Smile Laundry adalah : " + totalPendapat);
}
}

