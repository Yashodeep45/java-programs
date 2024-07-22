package FUNCTIONS;

public class Over {
  public static int Add(int a,int b){
    return a+b;
  }
  public static float Add(float p,float q,float r){
    return p+q+r;
  }
  public static void main(String[] args) {
    System.out.println(Add(5, 6));
    System.out.println(Add(3.2f,1.1f,3.6f));
  }
}
