/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPrakNo3;

/**
 *
 * @author HP
 */
public class NilaiAlgoritma {
   	public String namaMHS;
	public int tugas;
        public int kuis;
        public int uts;
        public int uas;
	public double tampung;
        
        
	public double hitungNilaiTotal(int tugas,int quiz,int uts,int uas) {
		tampung +=(tugas*30/100)+(quiz*20/100)+(uts*20/100)+(uas*30/100);
		 return (tugas*30/100)+(quiz*20/100)+(uts*20/100)+(uas*30/100);
	}
	public double rataNilai (int n) {
		return tampung/n;
			}
}
    

