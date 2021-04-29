/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo5;

/**
 *
 * @author HP
 */
public class No5SLL {
     NodeNo5 head, tail;
   
   public boolean isEmpty(){
       return head == null;
   }
    public void print() {
        if (!isEmpty()) {
            NodeNo5 tmp = head;
            System.out.println("DAFTAR NASABAH:\t");
            while (tmp != null) {
                System.out.println("No Rekening\t : "+tmp.noRek);
                System.out.println("Nama Nasabah\t : "+tmp.nama);
                System.out.println("Alamat\t : "+tmp.alamat);
                System.out.println("");
                tmp = tmp.next;
            }
        }else {
            System.out.println("Linked List Kosong");
        }
    }
     public void addFirst(String noRek, String nama, String alamat) {
        NodeNo5 nsbh = new NodeNo5(null, noRek, nama, alamat);
        if (isEmpty()) { //jika linked list kosong
            head = nsbh; // head dan tail sama dengan node input
            tail = nsbh;
        } else {
            nsbh.next = head;
            head = nsbh;
        }
    }
      public void addLast(String noRek, String nama, String alamat) {
        NodeNo5 nsbh = new NodeNo5(null, noRek, nama, alamat);
        if (isEmpty()) {
            addFirst(noRek, nama, alamat);
        } else {
            tail.next = nsbh;
            tail = nsbh;
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
      public void getDataHead(){
        NodeNo5 tmp = head;
          System.out.println("Antrian Terdepan : "+tmp.noRek+ " "+tmp.nama);
    }
     public void getPosition(String key){
         NodeNo5 tmp = head;
         int index = 0;
         while(tmp != null && !tmp.nama.equals(key)){
             tmp = tmp.next;
             index++;
         }
         if(tmp==null){
             System.out.println("Antrian Nasabah tidak ditemukan!!");
         }else{
             System.out.println("Antrian berada pada index ke-" + index + " antrian no "+(index+1));
         }
     } 
}

