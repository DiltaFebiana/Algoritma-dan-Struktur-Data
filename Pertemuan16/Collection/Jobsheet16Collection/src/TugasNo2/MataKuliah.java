/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;

/**
 *
 * @author HP
 */
import java.util.Comparator;
public class MataKuliah {
    String kode;
    String matakuliah;
    String sks;

    public MataKuliah() {
    }

    public MataKuliah(String kode, String matakuliah, String sks) {
        this.kode = kode;
        this.matakuliah = matakuliah;
        this.sks = sks;
    }
   static Comparator<MataKuliah> ComMkKode = new Comparator<MataKuliah>(){
        public int compare (MataKuliah mk1, MataKuliah mk2){
        return mk1.kode.compareTo(mk2.kode);
 }
 };

}
