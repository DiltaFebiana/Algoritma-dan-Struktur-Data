/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo1;

/**
 *
 * @author HP
 */
import java.util.Stack;
import java.util.Scanner;
public class MainStackTerbalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack tumpukan = new Stack();
        String kalimat;
        System.out.print("Masukkan kalimat:");
        kalimat = sc.nextLine();
        for (int i = 0; i < kalimat.length(); i++){
            tumpukan.push(new Character(kalimat.charAt(i)));
        }
        System.out.println("Hasil: ");
        while (!tumpukan.empty()){
            Object elemen = tumpukan.pop();
            System.out.print(elemen);
           
        }
        System.out.println("");
    }
}
