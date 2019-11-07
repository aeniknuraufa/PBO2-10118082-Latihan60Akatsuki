/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118082.latihan60.akatsuki;

/**
 *	
 * @author
 * Nama     : Aenik Nur Aufa
 * Kelas    : IF 2
 * NIM      : 10118082
 * Deskripsi Program : Membuat program dengan pendekatan berbasis objek untuk menampilkan
 * keanggotaan akatsuki berdasarkan desa atau asal
 */
public class Akatsuki extends AnggotaDesa {
    public Akatsuki() {
        super();
    }
    
    public void tampilAnggotaDesa(int desa) {
        System.out.println("Anggota Dari "+getNamaDesa(desa)+" : ");
        
        if(desa <= 8) {
            System.out.println(getAnggotaDesa(desa));
       
            
        }
    }
}
