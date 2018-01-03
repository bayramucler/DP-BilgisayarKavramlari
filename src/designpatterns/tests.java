/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author byrm
 */
public class tests {
      
    public static String repeat(char c,int i)
         {
         String tst = "";
         for(int j = 0; j < i; j++)
             {
             tst = tst+c;
         }
         return tst;
     }
       
    
    static char firstRepeat (String myString){
        
  char[] myCharArray = myString.toCharArray();//
  for (int i = 0; i < myString.length(); i++) {
   for (int j = i + 1; j < myString.length(); j++) {
    if (myCharArray[i] == myCharArray[j] ) {
     return myCharArray[j];
    }
   }
  }
        return ' ' ;
    }
    
    static void divisibilityRule (String [] array){
        for (int i = 1; i < array.length+1; i++) {
  
    if(i%28==0){
        array[i-1] = "fs";
    }
    else if(i%4==0){
    array[i-1] = "f";
    } else if( i%7==0){
      array[i-1] = "s";

    }
     
     else{
        array[i-1] = String.valueOf(i);
    }
    
    }
        
        
    for (int i = 0; i < array.length;i++){
               
               System.out.print(array[i]+", ");
    }
    }
    
    
    static void linkedMeth(LinkedList list){
        
        
    }
   
    
    public static void main(String args[]){
     
       // divisibilityRule(new String[100]);
      //  System.out.println(firstRepeat("Intergalactic")); 
        
  int count = 0;
for (int i = 100; i > 0; i /= 2) 
    for (int j = 0; j < i; j++) 
        count++;
     
        System.out.println(count);
     
}







       
      
}







