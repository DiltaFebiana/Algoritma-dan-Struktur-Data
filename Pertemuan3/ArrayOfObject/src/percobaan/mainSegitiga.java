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
public class mainSegitiga {
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);
        
        System.out.println("Luas Segitiga ke-0 : " + sgArray[0].hitungLuas()+ ", Keliling Segitiga ke-0 : " +sgArray[0].hitungKeliling());
        System.out.println("Luas Segitiga ke-1 : " + sgArray[1].hitungLuas()+ ", Keliling Segitiga ke-1 : " +sgArray[1].hitungKeliling());
        System.out.println("Luas Segitiga ke-2 : " + sgArray[2].hitungLuas()+ ", Keliling Segitiga ke-2 : " +sgArray[2].hitungKeliling());
        System.out.println("Luas Segitiga ke-3 : " + sgArray[3].hitungLuas()+ ", Keliling Segitiga ke-3 : " +sgArray[3].hitungKeliling());
    }
}
