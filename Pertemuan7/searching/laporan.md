## JAWABAN PERTANYAAN PRAKTIKUM SEARCHING
### 6.2.3 
1.	Tampil data itu untuk menampilkan data apa saja yang akan dimunculkan atau atribut dari objek mahasiswa seperti nim,nama,umur,ipk dari objek mahasiswa setelah pencarian menggunakan nim tersebut.
Sedangkan tampil posisi yaitu untuk menampilkan tempat atau posisi dari data yang dicari tersebut terdapat pada indeks keberapanya.
2.	Fungsi break yaitu untuk menghentikan proses pencarian jika data yang dicari sudah ketemu ataupun jika tidak ditemukan.
3.	Program tetap dijalankan tetapi hasil dari data keseluruhan juga ikut tidak urut namun saat pencarian data tetap berjalan dengan benar jika data yang dicari ada maka outputnya data ditemukan.mengapa demikian? Karena memang kita mengurutkannya inputannya lewat keyboard atau diurutkan sendiri tidak menggunakan program pengurutan data seperti bubble sort,selection sort ,insertion sort ataupun merge sort.
### 6.3.3
1.	Pada 
    #### if (right >= left) {
    #### Mid = (left + right)/2
2.	Pada kode
    #### If(cari== listMhs[mid].nim){
    #### Return (mid)
    #### } else if (listMhs[mid].nim > cari) {
    #### Return FindBinarySearch(cari, left, mid-1);
     #### } else {
	Return FindBinarySearch(cari, mid+1, right);
}
3.	Iya masih berjalan karena binary search itu akan menggunakan metode divide conquer juga Ia akan membagi menjadi 2 terlebih dahulu atau dipecah-pecah jadi meski datanya tidak urut program tetap berjalan.
4. maka hasilnya akan tidak ditemukan meski dalam data tersebut ada data tersebut.
berikut kode yang diubah :
* <img src="./ss/pertNo4.png">
outputnya:
* <img src="./ss/outputPert4_1.png">
* <img src="./ss/outputPert4_2.png">
5. modifikasi :
* <img src="./ss/modifMhsPert.No5.png">
* <img src="./ss/modifPencMhsPert.5.png">
* <img src="./ss/modifPencMhsPert5_1.png">
* <img src="./ss/mainModifPert5_1.png">
* <img src="./ss/mainModifPert5_2.png">
* <img src="./ss/outputModifPert5_1.png">
* <img src="./ss/outputModifPert5_2.png">

## TUGAS
### 1. 
* <img src="./ss/classMHSNo1.png">
* <img src="./ss/classPencMhsNo1_1.png">
* <img src="./ss/classPencno1_2.png">
* <img src="./ss/classPencMhsno1_3.png">
* <img src="./ss/mainMhsno1.png">
* <img src="./ss/mainMhsNo1_1.png">
* <img src="./ss/outputMHSno1.png">
* <img src="./ss/outputMHSno1_1.png">
* <img src="./ss/outputMHS1_2.png">
* <img src="./ss/outputMHSno1_3.png">

### 2. 
* <img src="./ss/classMHSno2.png">
* <img src="./ss/classPencMhsno2.png">
* <img src="./ss/classPencMhsno2_2.png">
* <img src="./ss/mainMHSno2_1.png">
* <img src="./ss/mainMHSno2_2.png">
* <img src="./ss/outputMHSno2_1.png">
* <img src="./ss/outputMHSno2_2.png">
* <img src="./ss/outputMHSno2_3.png">

### 3.
* <img src="./ss/classArrayNo3.png">
* <img src="./ss/mainArrayNo3.png">
* <img src="./ss/outputArrayNo3.png">

### 4.
* <img src="./ss/classArray1Dno4.png">
* <img src="./ss/classPencNo4_1.png">
* <img src="./ss/classPencNo4_2.png">
* <img src="./ss/classPencNo4_3.png">
* <img src="./ss/classMainNo4_1.png">
* <img src="./ss/classMainNo4_2.png">
* <img src="./ss/outputArrayNo4_1.png">
* <img src="./ss/outputArrayNo4_2.png">