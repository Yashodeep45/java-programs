package FUNCTIONS;

import java.util.Scanner;

public class Binipr {
  public static int Fact(int n){
   int res=1;
    for(int i=1;i<=n;i++){
      res*=i;

    }
    return res;

  }
  public static int Coeff(int a,int b){
    int facta=Fact(a);
    int factb=Fact(b);
    int min=Fact(a-b);
    int fin=facta / (factb*min);
    return fin;

  }
  public static void main(String[] args) {
    System.out.println("Enter 1st number:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println("Enter 2nd number:");
    int b=sc.nextInt();
    int ans=Coeff(a, b);
    System.out.println(ans);

    //System.out.println(Coeff(a, b));
  }
}
