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
public class TV {
    String deskripsi = "";
    int jumlahChannel = 0;
    String[] channels = new String[jumlahChannel];
    int channelAktif = 0;
    int volume = 0;
    String pembeli = "";
    
    // constructor
    TV(final String p, final String deskripsi, final int jumlahChannel) {
        this.pembeli = p;
        this.deskripsi = deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
    
    // set deskripsi
    public void getDeskripsi() { 
        System.out.println(pembeli + " membeli " + deskripsi);
    }
    
    // set channel
    public void setChannels(String[] channels) {
        if (channels.length > this.jumlahChannel) {
            System.out.println("maaf Tv ini hanya dapat menampung " + this.jumlahChannel + " channel");
        } else {
            this.channels = channels;
            System.out.println("informasi channel berhasil di-update!");
        }
    }
    
    // get channel aktif
    public void getChannel() {
        if(this.channels.length == 0) {
            System.out.println("Belum ada channel yang di-set!");
        } else {
            String data = "";
            for (String channel : this.channels) {
                data += channel + " ";
            }
            System.out.println("Channel yang ada : [ " + data + "]");
        }
    }
    
    // set channel aktif
    public void setChannelAktif(int e) {
        this.channelAktif = e;
        int data = e;
        System.out.println("Pindah ke channel : " + this.channels[e-1]);
    }
    
    // set volume
    public void setVolume(int v) {
        System.out.println("Intensitas volume sekarang : " + v);
    }
    
    
}
class User {
    public static void main(String[] args) {
        
        TV user = new TV("RIZA", "TV ASUS, 23 inch", 10);
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
        
    }
}
