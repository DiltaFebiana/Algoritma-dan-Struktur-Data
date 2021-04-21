/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author HP
 */
public class Queue {
    public int max;
    public int size;
    public int front;
    public int rear;
    public int[] Q;
    
    public Queue(int max){
        this.max = max;
        Create();
    }
    public void Create(){
        Q = new int[max];
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
            System.out.println("Elemen queue terdepan: "+Q[front]);
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
                System.out.println(Q[i]+ " ");
                i = (i + 1)%max;//mengecek setiap elemen dari front smpek rear,selama nilai hasil bagi itu = 0 selagi hasil i dimodulokan nilai maxnya 
                //belum = 0 maka tetap dicetak atau lanjut lagi.
            }
            System.out.println(Q[i]+ " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan!");
      }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void Enqueue(int data){
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
    public int Deuqueue(){
        int data = 0;
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

