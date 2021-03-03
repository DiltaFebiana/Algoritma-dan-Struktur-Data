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
import java.util.Scanner;
public class mainBangunRuang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kubus[] kb = new Kubus[1];
        Bola[] bl = new Bola[1];
        prismaSegitiga[] ps = new prismaSegitiga[1];    
            
            for(int i=0;i<1;i++){
            kb[i] = new Kubus();
            System.out.println("KUBUS");
            System.out.print("Masukkan sisi: " );
            kb[i].sisi = in.nextInt();
            
            System.out.println("BOLA");
            bl[i] = new Bola();
            System.out.print("Masukkan phi: ");
            bl[i].phi = in.nextDouble();
            System.out.print("Masukkan jari-jari : ");
            bl[i].jariJari = in.nextInt();
            
            System.out.println("PRISMA SEGITIGA");
            ps[i] = new prismaSegitiga();
            System.out.print("Masukkan alas: ");
            ps[i].alas = in.nextInt();
            System.out.print("Masukkan tinggi: ");
            ps[i].tinggi = in.nextInt();
            System.out.print("Masukkan tinggi Prisma: ");
            ps[i].tinggiPrisma = in.nextInt();
            System.out.print("Masukkan keliling alas: ");
            ps[i].kelilingalas = in.nextDouble();
            System.out.print("masukkan luas alas: ");
            ps[i].luasAlas= in.nextDouble();
            }
           
            
            //cetak data
            System.out.println("==================================================");
            for(int i=0; i<1; i++){
            System.out.println("KUBUS");
            System.out.println("Sisi: " +kb[i].sisi);
            System.out.println("Luas Permukaan Kubus : " +  kb[i].luasPermukaan());
            System.out.println("Volume Kubus : " + kb[i].volume());
            
            System.out.println("BOLA");
            System.out.println("phi: "+bl[i].phi + ", jari-jari: "+ bl[i].jariJari);
            System.out.println("Luas Permukaan Bola : " + bl[i].luasPermukaan());
            System.out.println("Volume : " + bl[i].volume());
            
         
            System.out.println("KERUCUT");
            System.out.println("Alas: "+ ps[i].alas+ ", Tinggi:" +ps[i].tinggi+", Tinggi prisma: "+ps[i].tinggiPrisma+ ", Keliling Alas: "
                    +ps[i].kelilingalas + ", Luas Alas: " +ps[i].luasAlas);
            System.out.println("Luas permukaan kerucut : " + ps[i].luasPermukaan());
            System.out.println("volume : " + ps[i].volume());
        }
        
        
    }
}

