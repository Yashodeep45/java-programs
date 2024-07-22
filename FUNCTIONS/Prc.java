package FUNCTIONS;

import java.util.Scanner;

public class Prc {
  public static int Calculate() {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter English marks:");
    int a=sc.nextInt();
    System.out.print("Enter Marathi marks:");
    int b=sc.nextInt();
    System.out.print("Enter Hindi marks");
    int c=sc.nextInt();
    System.out.print("Enter Science marks");
    int d=sc.nextInt();
    System.out.print("Enter Social science marks:");
    int e=sc.nextInt();
    System.out.print("Enter Maths marks:");
    int f=sc.nextInt();

    /*char opr=sc.next().charAt(0);
    switch (opr) {
      case ('+'):System.out.println("Addition is:"+(a+b));
        
        break;
      case ('-'): System.out.println("Subtraction is:"+(a-b));  
        break;
      case ('/'): System.out.println("Answer is:"+(a/b));
        break;
        
      case('*'): System.out.println("Multiplication is:"+(a*b));
      break;
      default: System.out.println("WRONG INPUTS!!!!!");
        break;
    } */
   int total=a+b+c+d+e+f;
   String result=(total>210)? "Pass":"Fail";
    System.out.println("Your Result is:"+result);
    System.out.println(a%b);
    return 0;
 
  }
  
  public static void main(String[] args) {
    System.out.println("CHECK YOUR  RESULT!!");
    Calculate();
    System.out.println("THANK YOUU!!!");
    
  }
  
}
