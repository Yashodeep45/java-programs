package FUNCTIONS;

import java.util.Scanner;

public class Binary {
 public static void Bintodec(int n){
  int dec=0;
  int pow=0;
  
  
  while(n>0){
    int last=n%10;
    dec= dec+(last*(int) Math.pow(2,pow ));
    pow ++;
    n=n/10;

  }
  System.out.println(dec);

 }
 public static void main(String[] args) {
  System.out.println("enter number:");
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  Bintodec(a);
 }

}
