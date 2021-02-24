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
public class pacMan {
    int x, y, width, height;
    
    void moveLeft(){
        x = x-1;
        printPosition();
    }
    void moveRight(){
        x =x+1;
        printPosition();
    }
    void moveUp(){
        y = y-1;
        printPosition();
    }
    void moveDown(){
        y = y+1;
    }
    void printPosition(){
        for(int a=0; a<height; a++){
            for(int b=0; b<width; b++){
                if((b == x) && (a == y)){
                    System.out.println(" X ");
                }else{
                    System.out.println(" * ");
                }
            }
            System.out.println("");
        }
    }
            
}
