/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class QueueMain {
        public static void menu(){
            System.out.println("Masukkan operasi yang diinginkan: ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Peek Position");
            System.out.println("6. Peek At");
            System.out.println("7. Clear");
            System.out.println("-----------------------------------");
        }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Deuqueue();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    System.out.print("Masukkan data : ");
                    int data = sc.nextInt();
                    Q.peekPosition(data);
                case 6:
                    System.out.println("Index : ");
                    int idx = sc.nextInt();
                    Q.peekAt(idx);
                case 7:
                    Q.clear();
                    break;
            }
            }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
}
}


