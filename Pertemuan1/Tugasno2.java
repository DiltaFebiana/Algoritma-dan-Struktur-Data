/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Tugasno2 {
    public static void main(String[] args) {
        double saldo = 1000000;
        int a=0,b=0;
        do{
          a++;
            System.out.println("Pada Bulan Ke- " + (b+1) + " Saldo Rp " + (saldo));
            saldo = saldo + (saldo*0.02);
            b++;
        }while(saldo <= 1500000);
        System.out.println("Saldo mencapai Rp 1500000 pada bulan ke- " + a);
    }
        }

