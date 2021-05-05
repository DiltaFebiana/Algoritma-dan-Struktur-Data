/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo4;

/**
 *
 * @author HP
 */
public class doubleLinkedList {
     NodeNo4 head;
    int size;
    Mahasiswa data[];
                    
    public doubleLinkedList() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Mahasiswa data) {
        if (isEmpty()) {
            head = new NodeNo4(null, data, null);
        } else {
            NodeNo4 newNode = new NodeNo4(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Mahasiswa data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            NodeNo4 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new NodeNo4(current, data, null);
            size++;
        }
    }
    public void add(Mahasiswa data, int idx) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else if (idx < 0 || idx > size) {
            throw new Exception("Nilai Indeks di luar batas");
        } else {
            NodeNo4 current = head;
            int i = 0;
            while (i < idx) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeNo4 newNode = new NodeNo4(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeNo4 newNode = new NodeNo4(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("Node berhasil di hapus");
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong");
        } else if (head.next == null) {
            head = null;
            size--;
            System.out.println("Node berhasil di hapus");
            return;
        }
        NodeNo4 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
        System.out.println("Node berhasil di hapus");
        
    }
    public void remove(int idx) throws Exception {
        if (isEmpty() || idx >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (idx == 0) {
            removeFirst();
        } else {
            NodeNo4 current = head;
            int i = 0;
            while (i < idx) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
            System.out.println("Node berhasil di hapus");
        }
        
    }
    public void cariData(String nim) {
        int i = 0;
        boolean j = false;
        NodeNo4 current = head;
        Mahasiswa dt;
        if (head == null) {
            System.out.println("Linked List kosong");
            return;
        }
        for(current = head; current != null; current = current.next) {
            if (current.data.nim.equals(nim)) {
                j = true;
                System.out.println("Data " + nim + " berada pada indeks : " + i);
                System.out.println("IDENTITAS");
                System.out.println("NIM\t: " + current.data.nim);
                System.out.println("Nama\t: " + current.data.nama);
                System.out.println("IPK\t: " + current.data.ipk);
                break;
            }
            i++;
        }
        if (j) {
            System.out.println("Data " + nim + " berada pada indeks : " + i);
        } else {
            System.out.println("Data tidak tersedia di list");
        }
    }
    public void sortLinkedList() {
        NodeNo4 current = null, index = null;
        double tmp;
        if (head == null) {
            return;
        } else {
            for(current = head; current.next != null; current = current.next) {
                for(index = current.next; index != null; index = index.next) {
                    if(current.data.ipk < index.data.ipk) {
                        tmp = current.data.ipk;
                        current.data.ipk = index.data.ipk;
                        index.data.ipk = tmp;
                    }
                }
            }
        }
        System.out.println("--------------------");
        System.out.println("\tURUTAN DATA");
        System.out.println("--------------------");
        print();
    }
    public void print() {
        if (!isEmpty()) {
            NodeNo4 tmp = head;
            while (tmp != null) {
                System.out.println("| "+tmp.data.nim + "\t| " + tmp.data.nama+"\t| " + tmp.data.ipk +"\t|");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
