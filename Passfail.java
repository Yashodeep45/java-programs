import java.util.Scanner;

public class Passfail {
  public static void main(String[] args) {
      System.out.println("enter marks");
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
     String result=((a>=35))?"pass":"fail";
     System.out.println(result);
  }
}
