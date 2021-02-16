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
public class Tugasno3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N;
    int numb=0;
    
        System.out.print("Masukkan banyaknya N: ");
        N = sc.nextInt();
        
       for (int a = 0; a <= N; a++){
           numb += 2;
           if (numb %2 == 0){
               if(numb %4 == 0){
                   continue;
               }
           System.out.print(numb + ",");
        }
       }
      }
     }

