/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS1H;

/**
 *
 * @author HP
 */
public class Rekening {
    public String noRekening;
    public String nama;
    public String namaIbu;
    public String Phone;
    public String Email;
    
    public void Rekening(String a,String b, String c, String d, String e){
        noRekening = a;
        nama = b;
        namaIbu = c;
        Phone = d;
        Email = e;
    }
    public void tampilAll(){
        System.out.println("Nomor Rekening\t : " + noRekening);
        System.out.println("Nama Depan\t : " + nama);
        System.out.println("Nama Ibu\t : " + namaIbu);
        System.out.println("Phone\t : " + Phone);
        System.out.println("Email\t : " + Email);
    }
}
