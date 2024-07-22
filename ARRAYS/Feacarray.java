
package ARRAYS;

import java.util.*;

public class Feacarray {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Values of Arrays:");

    int values[]=new int[3]; // Array
    for(int a=0;a<=values.length-1;a++){
      values[a]=sc.nextInt();
    }
   //values[0]=sc.nextInt();
   // values[1]=sc.nextInt();
    //values[2]=sc.nextInt();

   
    System.out.print("Answer=");

      for(int i=0;i<values.length;i++){ //Array as input
    long result=1;
      for(int n=1;n<=values[i];n++){ //inner loop for calculation
        
        result*=n;
        

      }
     // 
      System.out.print(result+" ");

      
    }
    
  }
  
    
  }
  
//}  


