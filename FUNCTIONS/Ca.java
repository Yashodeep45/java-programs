package FUNCTIONS;

import java.util.Scanner;

public class Ca {
  public static int Fu(){
  Scanner sc=new Scanner(System.in);
  int c=sc.nextInt();
  int d=sc.nextInt();
  int add=c+d;
  return add;
  }
  public static int Calculte(int num1, int num2){
    int sum=num1 +num2;
    return sum;
   
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=Calculte(a, b);
    System.out.println(sum);
    
    int add=Fu();
    System.out.println(add);


    
    
  }
}
