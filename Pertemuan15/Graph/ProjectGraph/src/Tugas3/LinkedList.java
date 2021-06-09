/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author HP
 */
public class LinkedList {
    Node head;
    public int size;
    
    public LinkedList(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
     public void print(){
        if(!isEmpty()){
            Node tmp = head;
            while(tmp != null){
                System.out.println(tmp.data + "\t" );
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
      public void addFirst(int item){
        if(isEmpty()){
            head = new Node(null, item, null);
        }else{
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
       public void addLast(int item){
        if(isEmpty()){
          addFirst(item);   
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
       public void add(int item, int index) throws Exception {
           if(isEmpty()){
               addFirst(item);
           }else if (index < 0 || index > size){
               throw new Exception("Nilai Indeks di luar batas");
           }else{
               Node current = head;
               int i = 0;
               while (i < index){
                   current = current.next;
                   i++;
               }
               if(current.prev == null){
                   Node newNode = new Node(null, item, current);
                   current.prev = newNode;
                   head = newNode;
               }else{
                   Node newNode = new Node(current.prev, item, current);
                   newNode.prev = current.prev;
                   newNode.next = current;
                   current.prev.next = newNode;
                   current.prev = newNode;
               }
           }
           size++;
           
       }
       public int size(){
           return size;
       }
       public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
        public void clear() {
        head = null;
        size = 0;
    }
       public void removeFirst() throws Exception {
            if (isEmpty()){
                throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
            } else if (size == 1){
                removeLast();
            }else{
                head = head.next;
                head.prev = null;
                size--;
            }
        }
       public void removeLast() throws Exception {
            if (isEmpty()){
                throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
            } else if (head.next == null){
                head = null;
                size--;
                return;
            }
            Node current = head;
                while (current.next.next != null){
                    current = current.next;
                }
                current.next = null;
                size--;
            }
       public void remove(int index) throws Exception{
           if (isEmpty() || index >= size){
               throw new Exception("Nilai indeks di luar batas");
           }else if (index == 0){
               removeFirst();
           } else{
               Node current = head;
               int i = 0;
               while (i < index){
                   current = current.next;
                   i++;
               }
               if (current.next == null){
                   current.prev.next = null;
               }else if (current.prev == null){
                   current = current.next;
                   current.prev = null;
                   head = current;
               }else{
                   current.prev.next = current.next;
                   current.next.prev = current.prev;
               }
               size--;
           }
       }
       public int getFirst() throws Exception{
           if (isEmpty()){
               throw new Exception("Linked List kosong");
           }
           return head.data;
       }
       public int getLast() throws Exception{
           if (isEmpty()){
               throw new Exception("Linked List kosong");
           }
           Node tmp = head;
           while (tmp.next != null){
               tmp = tmp.next;
           }
           return tmp.data;
       } 
       public int FindSeqSearch(int carinilai) {
        Node tmp = head;
        int posisi = -1;
        int index = 0;
        while (tmp != null) {
            if (tmp.data == carinilai) {
                posisi = index;
            }
            index++;
            tmp = tmp.next;
        }
        return posisi;
     }
//method pengurutan data menggunakan Bubble sort secara ascending
public void BubbleSort() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else {
            Node dataawal = head;
            while (dataawal != null) {
                Node datanext = dataawal.next;
                while (datanext != null) {
                    if (dataawal.data > datanext.data) {
                        int temp = dataawal.data;
                        dataawal.data = datanext.data;
                        dataawal.next.data = temp;
                    }
                    datanext = datanext.next;
                }
                dataawal = dataawal.next;
            }
            Node printdata = head;
            while (printdata != null) {
                System.out.println(printdata.data);
                printdata = printdata.next;
            }
            System.out.println("");
        }
    
} 
}
