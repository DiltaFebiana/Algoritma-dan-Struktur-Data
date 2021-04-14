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
import java.util.Scanner;
public class mainStruk {
    public static void main(String[] args) {
        StrukBelanja st = new StrukBelanja(8);
          Scanner sc = new Scanner(System.in);
          char pilih;
          do{
              System.out.println("====================================");
              System.out.println("           STRUK BELANJA            ");
              System.out.println("====================================");
              System.out.print("Nomer Transaksi: ");
              int no = sc.nextInt();
              System.out.print("Tanggal Pembelian: ");
              String tanggal = sc.next();
              System.out.print("Jumlah Barang yang dibeli: ");
              int jumlah = sc.nextInt();
              System.out.print("total Harga Bayar: ");
              int hrg = sc.nextInt();
              System.out.println("===============================");
              
              StrukBelanja tr = new StrukBelanja(no, tanggal, jumlah, hrg);
              System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
              pilih = sc.next().charAt(0);
              sc.nextLine();
              st.push(tr);
          } while (pilih == 'y');
            st.print();
            st.pop();
            st.peek();
            st.print();
        } 
    }

