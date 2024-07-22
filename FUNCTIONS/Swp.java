package FUNCTIONS;

public class Swp {
  public static void ChangeA(int a){
    a=10;
    System.out.println(a);
  }public static void ChangeB(int b){
    b=10;
    System.out.println(b);
  }
  public static void main(String[] args) {
    int a=20;
    int b=20;
    ChangeA(a);
    ChangeB(b);
    
  }
}
