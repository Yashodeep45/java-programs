package FUNCTIONS;

import java.util.Scanner;

import org.xml.sax.SAXException;

public class Par {
  public static int Calculate(int num1, int num2){
    int sum=num1+num2;
    return sum;
  }
  

public static void main(String[] args) {
  System.out.println("WELCOMEEE!!");
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int d=sc.nextInt();
  int e=sc.nextInt();
  int c=a+b;
  int add= Calculate(e,d);
  System.out.println(add);
  System.out.println(c);


}
}

                                              
