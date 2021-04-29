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
public class No4SLL {
   NodeNo4 head, tail;
   
   public boolean isEmpty(){
       return head == null;
   }
    public void print() {
        if (!isEmpty()) {
            NodeNo4 tmp = head;
            System.out.println("DAFTAR NASABAH:\t");
            while (tmp != null) {
                System.out.println("No Rekening\t : "+tmp.noRek);
                System.out.println("Nama Nasabah\t : "+tmp.nama);
                System.out.println("Alamat\t : "+tmp.alamat);
                System.out.println("");
                tmp = tmp.next;
            }
            
        } else {
            System.out.println("Linked List Kosong");
        }
    }
     public void addFirst(String noRek, String nama, String alamat) {
        NodeNo4 nsbh = new NodeNo4(null, noRek, nama, alamat);
        if (isEmpty()) { //jika linked list kosong
            head = nsbh; // head dan tail sama dengan node input
            tail = nsbh;
        } else {
            nsbh.next = head;
            head = nsbh;
        }
    }
     public void addLast(String noRek, String nama, String alamat) {
        NodeNo4 nsbh = new NodeNo4(null, noRek, nama, alamat);
        if (isEmpty()) {
            addFirst(noRek, nama, alamat);
        } else {
            tail.next = nsbh;
            tail = nsbh;
        }
    }
      public void insertAfter(String key, String noRek, String nama, String alamat) {
        NodeNo4 nsbh = new NodeNo4(null, noRek, nama, alamat);
        NodeNo4 temp = head;
        do {
            if (temp.nama.equals(key)||temp.noRek.equals(key)) {
                nsbh.next = temp.next;
                temp.next = nsbh;
                if (nsbh.next == null)  tail = nsbh;
                break;
                }
            temp = temp.next;
        } while (temp != null);
    }
      public void insertAt(int index, String noRek, String nama, String alamat) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(noRek, nama, alamat);
        } else {
            NodeNo4 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeNo4(temp.next, noRek, nama, alamat);
            if (temp.next.next == null) tail = temp.next;
            }
        }
       public String getData(int index){
        NodeNo4 tmp = head;
        for (int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return (tmp.noRek+tmp.nama+tmp.alamat);
    }
      public int indexOf(String key){
        NodeNo4 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.nama.equalsIgnoreCase(key)){
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return (-1);
        }else {
            return index;
        }
    } 
      public void removeFirst(){
            if (isEmpty()){
                System.out.println("Linked List masih kosong, tidak dapat dihapus!");
            } else if (head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
        }
        public void removeLast(){
            if (isEmpty()){
                System.out.println("Linked List masih kosong, tidak dapat dihapus!");
            } else if (head == tail){
                head = tail = null;
            }else{
                NodeNo4 temp = head;
                while (temp.next != tail){
                    temp = temp.next;
                }
                temp.next = null;
                tail=temp;
            }
        }
        public void remove(String key){
            if (isEmpty()){
                System.out.println("Linked List Masih kosong, tidak dapat dihapus");
            } else {
                NodeNo4 temp = head;
                while(temp != null){
                    if ((temp.nama.equalsIgnoreCase(key))||(temp.noRek.equals(key)) && (temp==head)) {
                        this.removeFirst();
                        break;
                    } else if (temp.next.nama.equalsIgnoreCase(key)){
                        temp.next = temp.next.next;
                        if(temp.next == null){
                            tail = temp;
                        }
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
        public void removeAt(int index) {
            if (index == 0){
                removeFirst();
            } else {
                NodeNo4 temp = head;
                for (int i = 0; i < index -1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            }
        }


  
    }

