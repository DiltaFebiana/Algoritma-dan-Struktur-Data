/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.praktikum.pacMan;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class pacManMain {
    static pacMan pM = new pacMan();
    public static void main(String[] args) {
        lapangan();
    }
    static void lapangan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Tinggi: ");
        pM.height = sc.nextInt();
        System.out.print("Masukkan Lebar: ");
        pM.width = sc.nextInt();
        pM.x = 0;
        pM.y = 0;
        pM.printPosition();
        menuPilihan();
        
    } 
    static void menuPilihan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Langkah pacMan");
        System.out.println("1. Move Left");
        System.out.println("2. Move Right");
        System.out.println("3. Move Up");
        System.out.println("4. Move Down");
        System.out.print("pilih nomer menu langkah o> ");
        int menu = sc.nextInt();
        if(menu == 1){
            pM.moveLeft();
        }else if(menu == 2){
            pM.moveRight();
        }else if(menu == 3){
            pM.moveUp();
        }else if(menu == 4){
            pM.moveDown();
        }else{
            System.out.println("maaf menu yang anda pilih tidak tersedia");
        }
        menuPilihan();
}
}
