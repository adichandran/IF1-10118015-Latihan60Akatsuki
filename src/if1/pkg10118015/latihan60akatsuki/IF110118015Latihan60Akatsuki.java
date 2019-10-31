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
public class IF110118015Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Akatsuki akatsuki = new Akatsuki("Baju Hitam Bercorak Merah", 
                                        "Menangkap Jinchuriki Yang Tersebar Di Semua Negara");
       akatsuki.tampilAkatsuki();
       
       Anggota pain = new Anggota("Pain", "Memiliki besi hitam berupa tindikan di hampir seluruh tubuh ", 
               "Amegakure", "Rine Tensei, Shinra Tensei, BanshoTein, Chibaku Tensei", "Shiro", 
               "Jari Tengah", "konan", "", "");
       pain.tampilAkatsuki();
       
       Anggota konan = new Anggota("Konan", "Rambut Berwarna Biru Dan Aksesoris"
               + "Bunga Di Kepala ", "Amegakure", "Tenshi no Fukuin", "Shiro", 
               "Jari Tengah", "Pain", "", "");
       konan.tampilAkatsuki();
       
       Anggota zetsu = new Anggota("Zetsu", "Memiliki 2 Warna Wajah Hitam "
               + "dan Putih", "Chakra Kaguya Otsutsuki", "Kamui", "Babi Hitan", "KelingkingKanan", 
               "Tobi/Obito Uchiha", "", "");
       zetsu.tampilAkatsuki();
       
       Anggota kisame = new Anggota("Kisame Hoshigaki", "Penampilan Seperti Hiu", 
               "Kirigakure", "Pedang Samehada", "Selatan", "Jari Manis", 
               "Uchiha Itachi", "", "");
       kisame.tampilAkatsuki();
       
       Anggota tobi = new Anggota("Tobi Aka. Obito Uchiha", "Topeng Jingga dengan satu lubang mata", 
               "Konoha Gakure", "Sharingan, Mangekyo Sharingan", "tama", "Jempol Kiri", 
               "Deirara, zetsu", "", "");
       tobi.tampilAkatsuki();
       
       Anggota deidara = new Anggota("Deidara", "Berambut Pirang Dan Spealis "
               + "Ledakan", "Iwagakure", "C0, C1, C2, C3, C4", "Ao", "Telunjuk "
               + "Kanan", "Sasori,Tobi", "", "");
       deidara.tampilAkatsuki();
       
       Anggota hidan = new Anggota("Hidan", "Membawa Sabit Bermata Tiga", 
               "Yu gakure", "Immortality", "San", "Telunjuk Kiri", 
               "Kakuzu", "", "");
       hidan.tampilAkatsuki();
       
       Anggota kakuzu = new Anggota("Kakuzu", "Memakai Penutup Wajah", 
               "Takigakure", "Gian, Zokkoku", "Kita", "Jari Tengah", 
               "Hidan", "", "");
       kakuzu.tampilAkatsuki();
       
       Anggota sasori = new Anggota("Sasori", "Ahli Menggunakan Boneka", 
               "Sunagakure", "Kugutsu", "tama", "Jempol Kiri", "Deidara", 
               "", "");
       sasori.tampilAkatsuki();
       
       Anggota itachi = new Anggota("Uchiha Itachi", "Memiliki Sharingan", 
               "Konohagakure", "Amaterasu, Susano'o", "Shu", "Jari Manis", 
               "Kisame", "", "");
       itachi.tampilAkatsuki();
    }
    
}
