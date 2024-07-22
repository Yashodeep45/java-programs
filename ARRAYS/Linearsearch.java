package ARRAYS;

import java.util.Scanner;

public class Linearsearch {
  public static int Linear(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]==key){
        return i;
      }
      
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int numbers[]=new int[5];
    System.out.println("Enter Array elements:");
    for(int i=0;i<numbers.length;i++){
      numbers[i]=sc.nextInt();
    }
    System.out.println("ENTER TARGET:");
    int key=sc.nextInt();
    if(Linear(numbers, key)==-1){
      System.out.println("NOT IN ARRAY");
    }
    else{
   System.out.println("The index of target in array is: "+Linear(numbers, key)); //Linear(numbers, key);
    }
  }
}
