/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7_No4;

/**
 *
 * @author HP
 */
public class pencarianArray {
    array1D arr[] = new array1D[10];
    int idx;
    
    void SelectionSort(){
        for (int i = 0; i < arr.length; i++){
            int idxMin = i;
            for(int j = i + 1; j < arr.length; j++){
                if (arr[j].angka < arr[idxMin].angka){
                    idxMin = j;
                }
            }
            array1D tmp = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tmp;
        }
    }
    void tambah(array1D a){
        if (idx < arr.length) { 
            arr[idx] = a; 
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!");
        }
    }
    public void tampilIndex(int x, int pos){
        if (pos != -1){
            System.out.println("Data " + x + " ditemukan pada indeks ke- " + pos);
        } else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }
    void tampil(){
        for (array1D a : arr) {
            a.tampil();
            System.out.println("------------------");
        }
    }
    public void TampilData(int x, int pos){
        if (pos != -1){
            System.out.println("Nilai : " + arr[pos].angka);
        }else{
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }
   
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left+ right) / 2;
            if(cari == arr[mid].angka){
                return mid;
            }else if(arr[mid].angka > cari){
                return FindBinarySearch(cari, left, mid - 1);
            }else{
                return FindBinarySearch(cari, mid + 1,right);
            }
        }
        return -1;
    }
    public void dataMaks(){
        int maks = arr[9].angka;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].angka < maks){
        }
            i++;
    }System.out.println("Nilai Maksimal : " + maks);
    }
}