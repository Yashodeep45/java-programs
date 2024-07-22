package FUNCTIONS;

import java.util.Scanner;



public class Pro {

  public static int One(int a){
    int two=a;
    return two;
  }


  public static int  Sum(int b){
    int mul=b;
   // System.out.println(mul);
  // System.out.println("answer is:"+(a*b));
    return mul;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
   int mul= Sum( b);
   int two= One(a);
    System.out.println("answer is:"+mul*two);
    
  }
}
