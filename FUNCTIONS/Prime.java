package FUNCTIONS;
import java.util.*;


public class Prime {
  public static void main(String[] args) {
    //Scanner sc=new Scanner(System.in);
      //sc.nextInt();
      for(int n=1;n<=100;n++){
        //boolean isprime=true;

    for(int i=1;i<=n;i++){
      int count=0;
      if(n%i==0){
        //isprime=false;
       // System.out.println(n+"prime");
       count++;
       //break;
      }
      if(count==2){
        System.out.println(n+"is prime");
      }
      
      
    }
   

  }
}
}
