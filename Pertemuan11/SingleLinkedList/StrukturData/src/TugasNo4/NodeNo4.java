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
public class NodeNo4 {
    String noRek, nama, alamat;
    NodeNo4 next;
    
    public NodeNo4(NodeNo4 berikutnya, String... a){
        this.next = berikutnya;
        this.noRek = a[0];
        this.nama = a[1];
        this.alamat = a[2];
    }
}
