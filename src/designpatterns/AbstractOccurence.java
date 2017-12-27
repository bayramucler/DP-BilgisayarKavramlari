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

class dizi{
    String isim;
    String yapimci;
    
    ArrayList <bolum> bolumler = new ArrayList<bolum>();
    
    void bolumEkle(bolum d){
        bolumler.add(d);
    }
    
    void printBolumler() {
     
             for( int i = 0; i< bolumler.size();i++){
         
            System.out.println(bolumler.get(i).bolumIsmi + ", no :" +bolumler.get(i).bolumNumarasi + " y:" + bolumler.get(i).tarih);
             
        }
        }
    
    void printBolumlerForNo(int no){

        for( int i = 0; i< bolumler.size();i++){
            
            if(bolumler.get(i).bolumNumarasi==no){
            System.out.println(bolumler.get(i).bolumIsmi + ", no :" +bolumler.get(i).bolumNumarasi);
      
            }
                
        }
        
    }
    
    void removeBolumForNo(int no){
        for( int i = 0; i< bolumler.size();i++){
                       if(bolumler.get(i).bolumNumarasi==no){
bolumler.remove(i); 
            }
    
        }
        
        
    }

   
    
    
    
  
}

class bolum {
    String bolumIsmi;
    int bolumNumarasi;
    int tarih;
    public bolum(String bolumIsmi, int bolumNumarasi){
        this.bolumIsmi=bolumIsmi;
        this.bolumNumarasi = bolumNumarasi;
    }
      public bolum(String bolumIsmi, int bolumNumarasi, int tarih){
        this.bolumIsmi=bolumIsmi;
        this.bolumNumarasi = bolumNumarasi;
        this.tarih = tarih;

    }

    
}
public class AbstractOccurence {
    
    public static void main (String[] args){
        dizi TheSopranos = new dizi();
        TheSopranos.isim = "The Sopranos";
        TheSopranos.bolumEkle(new bolum("the wine of cat",1));
         TheSopranos.bolumEkle(new bolum("tony's fall",2));
         TheSopranos.bolumEkle(new bolum("chirs's dead!",3));
                  TheSopranos.bolumEkle(new bolum("The Turkish Goverment",57));
    // TheSopranos.printBolumlerForNo(57);

   
     dizi OZ = new dizi();
        OZ.isim = "The Oz";
        OZ.bolumEkle(new bolum("Simon Adebisi",1));
         OZ.bolumEkle(new bolum("the aryans",2));
        
   //  OZ.printBolumlerForNo(2);
         
     
     TheSopranos.printBolumler();
          
          TheSopranos.removeBolumForNo(3);
     TheSopranos.printBolumler();
     
      OZ.bolumEkle(new bolum("Yeni bölümü",45,2017));
           OZ.printBolumler();


    }
    
}
