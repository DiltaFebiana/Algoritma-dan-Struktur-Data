# jawaban praktikum Double Linked List
## 12.2.3
### 1. Perbedaan Single linked list dan Double Linked List yaitu:
#### Single Linked list adalah linked list yang hanya memiliki satu variabel pointer saja.Dimana pointer tersebut menunjuk ke node selanjutnya ,biasanya field pada tail mmenunjuk ke NULL.
#### Sedangkan Double linked list adalah suatu linked list yang memiliki dua variabel pointer yaitu pointer yang menunjuk ke node selanjutnya dan pointer yang menunjuk ke node sebelumnya.Setiap head dan tailnya juga menunjuk ke NULL.
### 2. Gunanya atribut next dan prev :
#### Next berguna untuk menunjuk ke node berikutnya.
#### prev berguna untuk menunjuk ke node sebelumnya.
### 3. menunjukkan bahwa headnya atau node awalnya dimulai dari null dan sizenya adalah 0.Jadi double linked list masih kosong.
### 4. Dikarenakan prev mulainya dari null atau pointer null,ketika akan menambahkan node pada urutan awal.
### 5. Mengartikan bahwa head akan dipindahkan ke node baru.
### 6. Mengartikan bahwa current itu termasuk head , di sebelum kode tersebut terdapat pernyataan bahwa Node current = head; jadi diawali dengan current.Pada next dengan null artinya apabila menambahkan diakhir maka setelah menambahkan diakhir maka setelah node baru tersebut nextnya menuju null.
## 12.3.3
### 1. head=head.next; 
kode tersebut melakukan pencarian lokasi awal double linked list , yang berada pada awal (head).lalu head.prev = null artinya node head yang menunjuk ke node sebelumnya bernilai null.
### 2. cara deteksi posisi data ada pada bagian akhir pada method RemoveLast()
Dengan cara mengeksekusi dari awal dengan next hingga null diakhir.Apabila sudah sampai null akhir maka akan dilakukan remove last.
potongan programnya :
#### }else if(head.next == null){
    head = null;
    size--;
    return;
} 
### 3. karena potongan program tersebut tidak jelas dan ambigu ,serta penunjukkan pointernya tidak jelas.
### 4. Kode tersebut mengeksekusi prev.next suatu node merupakan next dan termasuk menunjukkan node setelahnya.Apabila next.prev merupakan prev menunjukkan bahwa node sebelumnya.

# TUGAS PRAKTIKUM 
## 1. 
* <img src="./Double Linked List/ss/NodeNo1.png">
* <img src="./Double Linked List/ss/dllNo1.png">
* <img src="./Double Linked List/ss/dllNo1_2.png">
* <img src="./Double Linked List/ss/dllNo1_3.png">
* <img src="./Double Linked List/ss/dllNo1_4.png">
* <img src="./Double Linked List/ss/dllNo1_5.png">
* <img src="./Double Linked List/ss/dllNo1_6.png">
* <img src="./Double Linked List/ss/mainNo1_1.png">
* <img src="./Double Linked List/ss/mainNo1_2.png">
* <img src="./Double Linked List/ss/mainNo1_3.png">
* <img src="./Double Linked List/ss/outputNo1_1.png">
* <img src="./Double Linked List/ss/outputNo1_2.png">
* <img src="./Double Linked List/ss/outputNo1_3.png">
* <img src="./Double Linked List/ss/outputNo1_4.png">
* <img src="./Double Linked List/ss/outputNo1_5.png">
* <img src="./Double Linked List/ss/outputNo1_6.png">
## 2.
* <img src="./Double Linked List/ss/nodeNo2.png">
* <img src="./Double Linked List/ss/dllNo2_1.png">
* <img src="./Double Linked List/ss/dllNo2_2.png">
* <img src="./Double Linked List/ss/mainNo2_1.png">
* <img src="./Double Linked List/ss/mainNo2_2.png">
* <img src="./Double Linked List/ss/outputNo2_1.png">
* <img src="./Double Linked List/ss/outputNo2_2.png">
## 3. 
* <img src="./Double Linked List/ss/nodeNo3.png">
* <img src="./Double Linked List/ss/dllNo3_1.png">
* <img src="./Double Linked List/ss/dllNo3_2.png">
* <img src="./Double Linked List/ss/mainNo3_1.png">
* <img src="./Double Linked List/ss/mainNo3_2.png">
* <img src="./Double Linked List/ss/outputNo3_1.png">
* <img src="./Double Linked List/ss/outputNo3_2.png">
## 4.
* <img src="./Double Linked List/ss/nodeNo4.png">
* <img src="./Double Linked List/ss/mahasiswaNo4.png">
* <img src="./Double Linked List/ss/dllNo4_1.png">
* <img src="./Double Linked List/ss/dllNo4_2.png">
* <img src="./Double Linked List/ss/dllNo4_3.png">
* <img src="./Double Linked List/ss/dllNo4_4.png">
* <img src="./Double Linked List/ss/dllNo4_5.png">
* <img src="./Double Linked List/ss/dllNo4_6.png">
* <img src="./Double Linked List/ss/mainNo4_1.png">
* <img src="./Double Linked List/ss/mainNo4_2.png">
* <img src="./Double Linked List/ss/mainNo4_3.png">
* <img src="./Double Linked List/ss/mainNo4_4.png">
* <img src="./Double Linked List/ss/outputNo4_1.png">
* <img src="./Double Linked List/ss/outputNo4_2.png">
* <img src="./Double Linked List/ss/outputNo4_3.png">
* <img src="./Double Linked List/ss/outputNo4_4.png">
* <img src="./Double Linked List/ss/outputNo4_5.png">
* <img src="./Double Linked List/ss/outputNo4_6.png">

