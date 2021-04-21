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
public class Queue {
    int max;
    int size;
    int front;
    int rear;
    Mahasiswa[] antrian;
    
 public Queue(int max){
        this.max = max;
        Create();
    }
    public void Create(){
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }
     public boolean IsEmpty(){
        if(size == 0){//queue ketika kosong
            return true;
        }else{//queue ketika ada isinya 
            return false;
        }
    }
    public boolean IsFull(){
        if(size==max){
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan: " + antrian[front].nim + " "+ antrian[front].nama + " "+ antrian[front].absen
            + " " + antrian[front].ipk );
        }else{
            System.out.println("Queue Masih kosong");
        }
    }
     public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen terakhir: " + antrian[rear].nim + " "+ antrian[rear].nama + " "+ antrian[rear].absen
            + " " + antrian[rear].ipk);
        }else{
            System.out.println("Queue Masih kosong");
        }
    }
    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }
        else{
            int i = front;
            while(i != rear){
                System.out.print(antrian[i].nim + " "+ antrian[i].nama + " " + antrian[i].absen + " " + antrian[i].ipk);
                i = (i + 1)%max;//mengecek setiap elemen dari front smpek rear,selama nilai hasil bagi itu = 0 selagi hasil i dimodulokan nilai maxnya 
                //belum = 0 maka tetap dicetak atau lanjut lagi.
                System.out.println("");
            }
            System.out.println(antrian[i]+ " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void Enqueue(Mahasiswa antrian){
        if(IsFull()){
            System.out.println("Queue Sudah Penuh");
        }else{
            if(IsEmpty()){
                front = rear = 0;//data yang diisi adalah data pertama
            }else{
                if(rear == max -1){//kondisi dimana kita sudah mendapatkan data data
                    rear = 0;
                }else{
                    rear++;
                }
            }
            this.antrian[rear] = antrian;
            size++;
        
    }
    }
    public Mahasiswa Deuqueue(){
        Mahasiswa data = new Mahasiswa("", "", 0, 0);
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            data = antrian[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else {
                if (front == max -1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
    public void peekPosition(String nim){
        if (IsEmpty()){
            System.out.println("Queue Masih Kosong");
        }else {
            int i = front, idx = -1, count = 0;
            while(i < max){
                if(antrian[i].nim.equals(nim)){
                   idx = i;
                   count++;
                   break;
                }
                i++;
            }
            if (count > 0){
                System.out.println(antrian[idx].nim + " " + antrian[idx].nama + " " + 
                        antrian[idx].absen + " " + antrian[idx].ipk);
            }else{
                System.out.println(count + " " + nim);
                System.out.println("NIM tidak ada");
            }
        }
    }
    public void printMahasiswa(int posisi){
        if(IsEmpty()){
            System.out.println("Queue Masih Kosong");
        } else {
            if(posisi >= max || posisi < 0){
                System.out.println("lebih atau kurang dari size");
            }else{
                System.out.println(antrian[posisi].nim + " " + antrian[posisi].nama + " " +antrian[posisi].absen
                + " " + antrian[posisi].ipk);
            }
        }
    }
}
