/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan60akatsuki;

/**
 *
 * @author ACER
 */
public class Akatsuki {
    protected String kostum;
    protected String tujuan;

    public Akatsuki(String kostum, String tujuan) {
        this.kostum = kostum;
        this.tujuan = tujuan;
    }

    public String getKostum() {
        return kostum;
    }

    public String getTujuan() {
        return tujuan;
    }
    
    public void tampilAkatsuki() {
       System.out.println("###### Data Lengkap Anggota Akatsuki ######");
       System.out.println("");
       System.out.println("Kostum : " + getKostum());
       System.out.println("Tujuan : " + getTujuan());
       System.out.println("");
   }
    
    
}
