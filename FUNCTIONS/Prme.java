package FUNCTIONS;

public class Prme {
  public static boolean Prime(int a){
   // if(a=2){
      //System.out.println("true");
   // //  return true;
   // }
    boolean prime=true;
    for(int i=2;i<=a-1;i++){
      if(a%i==0){
        prime=false;
       return false;

      }
    }
   return prime;
  }
  public static void main(String[] args) {
    System.out.println(Prime(4));
  }
}
