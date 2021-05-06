/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2_1H_DiltaFebiana;

/**
 *
 * @author HP
 */
public class DoubleLinkedList {
     Node head;
    int size;
    Mahasiswa data[];
                    
    public DoubleLinkedList() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Mahasiswa data) {
        if (isEmpty()) {
            head = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Mahasiswa data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(current, data, null);
            size++;
        }
    }
    public void add(Mahasiswa data, int idx) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else if (idx < 0 || idx > size) {
            throw new Exception("Nilai Indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < idx) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, data, current);
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
        Node current = head;
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
            Node current = head;
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
    public void SeqSearch(String nim) {
        int i = 0;
        boolean j = false;
        Node current = head;
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
                System.out.println("jurusan\t: " + current.data.jurusan);
                System.out.println("Prodi\t: " + current.data.prodi);
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
    public void bubbleSort() {
        Node current = null, index = null;
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
            Node  tmp = head;
            while (tmp != null) {
                System.out.println("| "+tmp.data.nim + "\t| " + tmp.data.nama+"\t| " + tmp.data.jurusan +"\t| " + tmp.data.prodi +"\t| " 
                + tmp.data.ipk +"\t| ");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    public void mahasiswaPertama() throws Exception{
            if (!isEmpty()) {
                System.out.println("NIM : " + head.data.nim);
                System.out.println("Nama : " + head.data.nama);
                System.out.println("Jurusan : " + head.data.jurusan);
                System.out.println("Prodi : " + head.data.prodi);
                System.out.println("IPK : " + head.data.ipk);
           }
            else{
                System.out.println("Linked List masih kosong");
            }
}
}
