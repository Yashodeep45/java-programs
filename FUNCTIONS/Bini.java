package FUNCTIONS;

import java.util.Scanner;

public class Bini{
 
    public static int Fact(int a){
     int res=1;
      for(int i=1;i<=a;i++){
        res*=i;
  
      }
      return res;
    }
    public static int Coeff(int a,int b){
      int afact=Fact(a);
      int bfact=Fact(b);
      int min=Fact(a-b);
      int Coeff =afact / (bfact*min);
      return Coeff;
      
    }
    public static void main(String[] args) {
      System.out.println("Enter 1st number:");
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      System.out.println("Enter 2 number:");
      int b=sc.nextInt();
      //a!/b!(a-b)!
     System.out.println(Coeff(a, b));
      



     

    }





  }



