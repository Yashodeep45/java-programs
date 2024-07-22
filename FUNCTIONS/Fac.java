package FUNCTIONS;

import java.util.Scanner;

public class Fac {

  public static int run(int a) {
    int res = 1;
    for (int i = 0; i < 5; i++) {
      res *= i;
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int res=run(a);
    // System.out.println(res);
    System.out.println("HELLO");
    int a = sc.nextInt();
    sc.close();
    int ans = run(a);
    System.out.print(ans);
    // run(a);
  }
}
