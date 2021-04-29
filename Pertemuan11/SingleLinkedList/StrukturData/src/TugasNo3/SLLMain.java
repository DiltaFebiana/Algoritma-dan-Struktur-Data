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
public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.print();
        s.addFirst("Bahasa");
        s.print();
        s.addLast("Multimedia");
        s.print();
        s.insertAfter("Bahasa", "Android");
        s.print();
        s.insertBefore("Multimedia", "Statistika");
        s.print();
        s.insertAfter("Android", "Komputer");
        s.print();
        s.insertBefore("Statistika", "Algoritma");
        s.print();
        s.insertAfter("Komputer", "Basis Data");
        s.print();
        s.insertBefore("Algoritma", "Matematika");
        s.print();
    }
}
