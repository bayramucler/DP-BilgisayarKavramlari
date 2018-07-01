/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalysisofAlgorithm;

/**
 *
 * @author uclerpc
 */

/*
"C": Cost
"O": Big O Notation

If its order is:
O(1), O(log*n), O(n), O(n*log(n)), O(n^2), O(2^n), O(n!)…

*/
public class TımeAndSpaceComplexity {

    
  public static void exOne(){
      
      int n =5; // C1 1 time
      
      for(int i = 0; i<n; i++){ // C2 n times
          //do something
      }
      
      // C1 + C2*n
      // a*n + b
      // O(n)
      // space comp: according to size of n, so it is O(n)
      
  }
  
  public static void exTwo(){
      
    int n=5;
    int counter= 1;
      
    for(int i=0; i<n; i++){     //C1 n times
        for(int j=0; j<n; j++){   //C2 n*n times
            
            System.out.println(counter);
            counter++;
        }
    }
    
    // C1 * n + C2 * (n*n) 
    // n*(n*C2 + C1)
    // n*(a*n + b)
    // n*n
    // O(n*n)
    // space comp: according to size of n, so it is O(n*n)
    
  }
  
  public static void exThree(){
      int n=5;
      for(int i=0; i<n; i++){ // C1 n
          for(int j=0; j<n; j++){ // C2 n*n
              for(int p=0; p<n; p++){ // C3 n*n*n
                  
              }
          }
      }
      
      // O (n*n*n)
  }
  
  public static void exFour(){
      int n =5; 
      int counter= 1;
      for(int i = 0; i<=n; i++){ // C1 n+1 times
        
        for(int j = 0; j<n; j++){ // C2 n*(n+1) times
          System.out.println(counter);
          counter++;
        }
      }
      
      // C1*(n+1) + C2*(n*(n+1))
      // C2*n + C1 + C2*n*n + C2*n
      // a*n + b*n*n + c
      // O(n*n)
      
  }
  
   public static void exFive(){
      int i =1;     //C1 1 time
      int sum = 0;  //C2 1 time
      int n = 5;    //C3 1 time
      while(i<=n){  //C4 n+1 times
          i++;      //C5 n times
          sum=sum+i;//C6 n times
          System.out.println("xxx"); // C7 n times
      }
      
      // C1 + C2 + C3 + C4*(n+1) + C5*n + C6*n + C7*n
      // (C4 + C5 + C6 + C7) + (C1 + C2 + C3 + C4)
      // a*n + b
      // O(n)
  }
   
  public static void exSix(){
      int n = 10;
      for(int i=n; i>0; i/=2){ 
      }
      
      // O(log*n)
      
  }
  
  public static void exSeven(){
      int a=10;
      
      if(a>10){ //C1 1 
        a=15;   //C2 1
        System.out.println(a); //C3 1
      }else{    
        a=5;    //C4 1
      }
      
      // C1 + max(C2+C3, C4)
      // C1 + C2 + C3
      // 1  + 1  + 1
      // 3
      // O(1)
  }
  
  
}
