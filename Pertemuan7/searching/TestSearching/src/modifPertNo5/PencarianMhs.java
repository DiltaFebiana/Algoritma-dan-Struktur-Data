/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifPertNo5;

/**
 *
 * @author HP
 */
public class PencarianMhs {
    Mahasiswa listMhs[];
    int idx; // nilai index
    
    PencarianMhs(int jumlah){
        listMhs = new Mahasiswa[jumlah];
    }
            

    
    void tambah(Mahasiswa m){
        if (idx < listMhs.length) { 
            listMhs[idx] = m; 
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!");
        }
    }
    
    void tampil(){
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("------------------");
        }
    }
    
    
    public void TampilPosisi(int x, int pos){
        if (pos != -1) { 
            System.out.println("data    : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("data "  + x + " tidak ditemukan");
        }
    }
    
    public void TampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("NIM\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left+ right) / 2;
            if(cari == listMhs[mid].nim){
                return mid;
            }else if(listMhs[mid].nim > cari){
                return FindBinarySearch(cari, left, mid - 1);
            }else{
                return FindBinarySearch(cari, mid + 1,right);
            }
        }
        return -1;
    }
}
