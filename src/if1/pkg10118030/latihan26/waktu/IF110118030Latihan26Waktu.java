/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan26.waktu;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      :10118030
 * Deskripsi Program : Program ini berisi tentang menampilkan waktu saat ini
 */
public class IF110118030Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Date sekarang = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E, d/M/yyyy, hh:mm:ss");

      System.out.println("Hari ini adalah hari: " + ft.format(sekarang));
    }
    
}
