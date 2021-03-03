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
public class Segitiga {
    public int alas;
    public int tinggi;
    
    public Segitiga(int a, int t){
        alas=a;
        tinggi=t;
    }
    public double hitungLuas(){
        double l=0.5;
        return 0.5*alas*tinggi;
    }
    public int hitungKeliling(){
        return alas+alas+alas;
    }
}
