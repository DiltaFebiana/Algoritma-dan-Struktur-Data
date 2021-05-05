/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo3;

/**
 *
 * @author HP
 */
public class DoubleLinkedList {
     Node head;
     int size;
                    
    public DoubleLinkedList() {
        head = null;
        size = 1;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addLast(String no, String nama){
        if (isEmpty()) {
            head = new Node(null, no,nama, null);
        } else {
        Node current = head;
        while (current.next != null) { 
            current = current.next;
        }
        Node newNode = new Node(current, no, nama, null);
        current.next = newNode;
        size++;
 }
}
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus");
        } else if (size == 1) {
            head= null;
            size=0;
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi ");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
     public void print(){
            if (!isEmpty()) {
                System.out.println("|No\t|Nama\t|");
                Node tmp = head;
                while (tmp!= null) { 
                    System.out.println("|" + tmp.no + "\t|" + tmp.nama+ "\t|");
                    tmp=tmp.next;
                    System.out.println();
                }
                System.out.println("Sisa Antrian : " + size);
                } else {
                System.out.println("Linked List Kosong");
 }
 }
}
