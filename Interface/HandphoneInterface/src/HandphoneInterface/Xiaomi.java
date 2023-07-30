package HandphoneInterface;
import Interfaces.Phone;

public class Xiaomi implements Phone {
     private int volume;
     private boolean isPowerOn;

     public Xiaomi() {
          // set volume awal
          this.volume = 50;
     }

     // override semua abstract method yang ada di Phone
     public void powerOn() {
          isPowerOn = true;
          System.out.println("Handphone menyala...");
          System.out.println("Selamat datang di Xiaomi");
          System.out.println("Android version 10");
     }

     public void powerOff() {
          isPowerOn = false;
          System.out.println("Mematikan handphone...");
     }

     public void volumeUp() {
          if (isPowerOn) {
               if (this.volume == MAX_VOLUME) {
                    System.out.println("Volume Sudah Maksimal!!!");
                    System.out.println("Volume = "+this.volume+"%");
               }else{
                    this.volume += 10;
                    System.out.println("Volume sekarang : " + this.volume);
               }
          }else{
               System.out.println("Handphone mati, silahkan nyalakan dulu!!");
          }
     }

     public void volumeDown() {
          if (isPowerOn) {
               if (this.volume == MIN_VOLUME) {
                    System.out.println("Volume = " + this.volume + "%");
               } else {
                    this.volume -= 10;
                    System.out.println("Volume sekarang : " + this.volume);
               }
          } else {
               System.out.println("Handphone mati, silahkan nyalakan dulu!!");
          }
     }

     // getter & setter
     public int getVolume() {
          return volume;
     }

     public void setVolume(int volume) {
          this.volume = volume;
     }

     public boolean IsPowerOn() {
          return isPowerOn;
     }

     public void setPowerOn(boolean ispowerOn) {
          this.isPowerOn = ispowerOn;
     }
     
}
