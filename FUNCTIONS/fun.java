package FUNCTIONS;

import java.util.Scanner;

public class fun {
  public static int printhelloworld() {
    System.out.println("Hello ");
   
    return 0;


    
  }
  public static void  Calculatesum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter A");
    int a=sc.nextInt();
    System.out.println("Enter B");
    int b=sc.nextInt();
    int sum= a + b;
    System.out.println("sum is:" +sum);

    
  }
  public static void main(String[] args) {
    printhelloworld();
    Calculatesum();
    System.out.print("FINISH");
    
   
    
  }
}
