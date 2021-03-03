/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatianNo2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainTanah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jumlah Tanah: ");
        int j = input.nextInt();
        Tanah[] tnh = new Tanah[j];
        
        for(int i=0;i<j;i++){
            tnh[i] = new Tanah();
            System.out.println("Tanah " + (i+1));
            System.out.print("panjang: ");
            tnh[i].panjang=input.nextInt();
            System.out.print("Lebar: ");
            tnh[i].lebar=input.nextInt();
            
            System.out.println("===========================================");
        }
        for(int i=0;i<j;i++){
            System.out.println("Luas Tanah : " + tnh[i].hitungLuas());
        }
    }

    

       
        
    }

