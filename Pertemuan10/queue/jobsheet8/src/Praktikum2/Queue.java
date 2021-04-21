/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author HP
 */
public class Queue {
    int max;
    int size;
    int front;
    int rear;
    Penumpang[] Q;
    
 public Queue(int max){
        this.max = max;
        Create();
    }
    public void Create(){
        Q = new Penumpang[max];
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
            System.out.println("Elemen terdepan: " + Q[front].nama + " "+ Q[front].kotaAsal + " "+ Q[front].kotaTujuan
            + " " + Q[front].jumlahTiket + " "+ Q[front].harga);
        }else{
            System.out.println("Queue Masih kosong");
        }
    }
     public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen terakhir: " + Q[rear].nama + " "+ Q[rear].kotaAsal + " "+ Q[rear].kotaTujuan
            + " " + Q[rear].jumlahTiket + " "+ Q[rear].harga);
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
                System.out.print(Q[i].nama + " "+ Q[i].kotaAsal + " " + Q[i].kotaTujuan + " " + Q[i].jumlahTiket + " " + Q[i].harga);
                i = (i + 1)%max;//mengecek setiap elemen dari front smpek rear,selama nilai hasil bagi itu = 0 selagi hasil i dimodulokan nilai maxnya 
                //belum = 0 maka tetap dicetak atau lanjut lagi.
                System.out.println("");
            }
            System.out.println(Q[i]+ " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void Enqueue(Penumpang data){
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
            Q[rear] = data;
            size++;
        
    }
    }
    public Penumpang Deuqueue(){
        Penumpang data = new Penumpang("", "", "", 0, 0);
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            data = Q[front];
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
}

