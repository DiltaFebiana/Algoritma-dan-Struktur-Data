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
public class doubleLinkedList {
 node head;
 int size;
    public doubleLinkedList() {
        head = null;
        size = 0;
 }
    public boolean isEmpty(){
        return head == null; }
    public void addLast(String item){
        if (isEmpty()) {
            head = new node(null, item, null);
        } else {
        node current = head;
        while (current.next != null) { current = 
               current.next;
        }
        node newNode = new node(current, item, null);
        current.next = newNode;
        size++;
 }
 }
    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if(size==1) {
            head = null;
            size = 0;
        } else {
            head = head.next;
            head.prev = null;
            size--;
 } }
        public String getFirst() throws Exception{
            if (isEmpty()) {
            throw new Exception("Linked List Kosong");
 }
            return head.data;
 }
        public void print(){
            if (!isEmpty()) {
                node tmp = head;
                while (tmp!= null) { 
                System.out.println(tmp.data);
                tmp=tmp.next;
                }
                } else {
                System.out.println("Linked List Kosong");
 }
 }
}
