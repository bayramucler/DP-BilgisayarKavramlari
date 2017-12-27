/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

import java.util.ArrayList;

/**
 *
 * @author byrm
 */

class calisan {
    String isim;
    calisan yonetici;
    
    public calisan(){
        
    }
    public calisan(String isim){
        this.isim=isim;
    }
}

class yonetici extends calisan {
    ArrayList <calisan> altlari = new ArrayList<calisan>();
    
    public yonetici(String isim){
        super(isim);
    }
    public void addCalisan (calisan alt){
        altlari.add(alt);
        alt.yonetici=this;
    }
    
}


public class GeneralHierarchy {
    
    public static void main(String[] args){
        yonetici ali = new yonetici("ali");
        calisan veli = new calisan("veli");
        calisan ahmet = new calisan("ahmet");
        
        ali.addCalisan(ahmet);
        ali.addCalisan(veli);
        
        System.out.println("ahmetin yon: " + ahmet.yonetici.isim);
       System.out.println("velinin yon: " + veli.yonetici.isim);
       
     System.out.println("alinin calisanlari: " + ali.altlari.get(0).isim + ", " + ali.altlari.get(1).isim);

    }
    
}
