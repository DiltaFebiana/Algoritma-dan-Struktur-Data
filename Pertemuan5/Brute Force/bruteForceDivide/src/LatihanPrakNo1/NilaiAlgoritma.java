/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPrakNo1;

/**
 *
 * @author HP
 */
public class NilaiAlgoritma {
    public String NamaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;
    
    public double hitungTotalNilai(){
        double nilaiTotal = (nilaiTugas*0.3)+(nilaiKuis*0.2)+(nilaiUTS*0.2)+(nilaiUAS*0.3);
        return nilaiTotal;
}
}
