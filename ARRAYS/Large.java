package ARRAYS;
import java.util.*;
public class Large {
  public static void main(String[] args) {
    
  
  int Array[]={1,2,3,6,4,98};
  int large=Integer.MIN_VALUE;
  for(int i=0;i<Array.length;i++){
    if(Array[i]>large){
      large=Array[i];
    }
  }
  int key=large;
  for(int n=0;n<Array.length;n++){
    if(Array[n]==large){
      System.out.println(n);
    }
  }

 System.out.println(large);
}
}
