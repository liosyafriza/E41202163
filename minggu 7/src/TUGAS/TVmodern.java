/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author LIO SYAFRIZA
 */
public class TVmodern extends TV{
    
    public TVmodern(String p, String deskripsi, int jumlahChannel) {
        super(p, deskripsi, jumlahChannel);
    }
    
    static String TELETEXT = "TELETEXT";
    static String TV = "TV";
    
    /*
        TELETEXT
    */
    public void setModusTampilan(String t) {
        TVmodern.TELETEXT = t;
    }
    
    public void getModusTampilan() {
        System.out.println("Modus tampilan : " + TELETEXT);
    }
    
    public void setHalamanTeletext(int h) {
        System.out.println("Berpindah ke halaman teletext " + h);
    }
    
    /*
        CD
    */
    String cd = "";
    public void setDiscTray(String e) {
        this.cd = e;
    }
    
    public void playCD() {
        if (cd.equals("")) {
            System.out.println("Tidak ada CD di dalam disc tray!");
        } else {
            System.out.println("Memutar film " + cd);
        }
    }
    
    
    public static void main(String[] args) {
        
        TVmodern user = new TVmodern("RIZA", "TV mercury", 10);
 
        String[] channel = {
          "RCTI", "INDOSIAR", "TV ONE", "MNC", "TRANS 7",
          "ANTV", "NET", "METRO TV", "BAYUANGGA", "GTV"
        };
        
        
        user.getDeskripsi();
        user.getChannel();
        user.setChannels(channel);
        
        user.setChannelAktif(2);
        user.setVolume(100);
        user.setChannelAktif(1);
        user.setChannelAktif(10);
        
        // teletext con
        user.setModusTampilan(TVmodern.TELETEXT);
        user.getModusTampilan();
        user.setHalamanTeletext(250);
        user.setModusTampilan(TVmodern.TV);
        user.getModusTampilan();
        
        // CD
        user.playCD();
        user.setDiscTray("Titanic");
        user.playCD();
        
    }
}
