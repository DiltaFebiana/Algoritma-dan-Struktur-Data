# JAWABAN PERTANYAAN PERCOBAAN PRAKTIKUM
## 4.2.3 
### 1.	Base line algoritma divide conquer:
SOLVE:upa masalah yang berukuran n--> 
if(n==1)
DIVIDE:membagi masalah (nilai faktorial) menjadi beberapa upa-masalah yang memiliki kemiripan dengan masalah semula namun berukuran lebih kecil.
-CONQUER:menyelesaikan masing-masing upa-masalah tersebut menjadi independent secara rekursif. COMBINE:menggabungkan solusi masing-masing upa-masalah sehingga menjadi solusi dari masalah semula menjadi hasil jawaban.
#### 2.	Kode:
* <img src="./ss/kodeDC.png">
#### 3.	Iya memungkinkan atau bisa.
#### 4.	Waktu eksekusi 11 detik
#### 5.	Waktu eksekusi bertambah lama yaitu sampai 1 menit lebih.
## 4.3.3
1.	Pada pangkat BF lebih simple karena prosesnya hanya hasil*a.Sedangkan pangkat DC method dibagi menjadi 2 upa masalah ,masing-masing berukuran (a,n/2),upa masalah pertama berukuran(a,n/2)*a,upa masalah kedua(a,n/2).
2.	Potongan kode program tersebut merupakan penyelesaian upa masalah secara rekursif.
3.	Ya,tahap combine sudah termasuk dalam kode tersebut yaitu di:
4.	 Modif
5.	Modif
4.4.3
1.	Perbedaan perhitungannya yaitu jika pada brute force  total = total+arr[i] atau total langsung ditambah nilai pada array i.sedangkan pada divide conquer masih dibagi -bagi lagi menjadi beberapa upa masalah misal pada kode tersebut pertama dibagi 2 atau pada kode 
Int mid=(1+r)/2
ada untuk bagian tengah atau mid.
Double 1sum=totalDC(arr,1,mid-1);
Double rsum=totalDC(arr,mid+1,r)
2.	Jika ingin membatasi maka biasanya digunakan 2 angka atau 1 angka dibelakang koma supaya standar.jika ingin memunculkan 2 angka dibelakang koma maka kode nya %.2f.
3.	Ya karena akan mengembalikan nilai atau hasil yang telah dibagi-bagi pada proses 1sum dan rsum.
4.	Karena untuk menghitung total jumlah dari bilangan-bilangan yang dimasukkan pada untung bulan ke-1 sampai 5 dibutuhkan variable mid karena perhitungan dilakukan secara linear,yang menghasilkan kompleksitasO(n).Dan cara ini tetap menerapkan Teknik rekursif untuk membagi-bagi masalah menjadi masalah yang lebih kecil.
5.	
