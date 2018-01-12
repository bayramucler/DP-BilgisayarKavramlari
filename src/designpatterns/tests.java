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
 
   
       
    static void complexity(){
        int n = 16;
       
        int s = 0;
        
//        for(int i=0;i<=n;i++){     
//          for(int j=0;j<m;j++){
//              
//        s++;
//        System.out.println(s);
//        }
//        }
     //eklendi


//for(int i = n; i > 0; i/=2){
// s++;
//        System.out.println(i);
//
// }
//
//
//for(int i = 1; i<=n; i*=2){
//         System.out.println(i);
//
//}

 
  
   


    
    }
    
    static char firstRepeat (String myString){
        
  char[] myCharArray = myString.toCharArray();            // c1   1 times
  for (int i = 0; i < myString.length(); i++) {           // c2   n+1 times (so, according to myString.length times)              
      for (int j = i + 1; j < myString.length(); j++) {   // c3   n+n*(n-1)/2 times (it's also according to myString.length times but the counter j=i+1.)
    if (myCharArray[i] == myCharArray[j] ) {              // c4   n*(n-1)/2 times
     return myCharArray[j];                               // c5 <=n*(n-1)/2 times
    }
   }
  }
        return ' ' ;                                       // c6 1 times
    }
    
    // c1 + c2*(n+1) + c3*(n+n*(n-1)/2) + c4*(n*(n-1)/2) + c5*(n*(n-1)/2) + c6
    // the algorithm requires time proportional to n*n, it is O(n*n)
    // space comp: according to size of myCharArray(myString.length), so it is O(n).
    
    static void divisibilityRule (String [] array){
        for (int i = 1; i < array.length+1; i++) { //c1   n+1 times
    if(i%28==0){                                   //c2   n times
        array[i-1] = "fs";                         //c3 <=n times
    }
    else if(i%4==0){                               //c4   n times
    array[i-1] = "f";                              //c5 <=n times
    } else if( i%7==0){                            //c6   n times
      array[i-1] = "s";                            //c7 <=n times

    }
     
     else{
        array[i-1] = String.valueOf(i);            //c8  n times
    }
    
    }
        
        
    for (int i = 0; i < array.length;i++){   // c9  n+1 times
        System.out.print(array[i]+", ");    //c10   n times
               
    }
    
    // c1*(n+1) + c2*n + c3*n + c4*n + c5*n + c6*n + c7*n + c8*n + c9*(n+1) + c10 * n
    // c1*n + c2*n + c3*n + c4*n + c5*n + c6*n + c7*n + c8*n + c9*n + c10*n  c1 + c9 
    // (c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10)*n + c1+c9
    // a*n + b 
    // O(n)
     // space comp: according to size of array, so it is O(n).
    }
    
    
  
   
    
    public static void main(String args[]){
     
      //    divisibilityRule(new String[100]);
      //  System.out.println(firstRepeat("Intergalactic")); 
      complexity(); 
  

     
}



       
      
}







