package ARRAYS;

public class Subarrays {
  public static void main(String[] args) {
    int Sum = Integer.MIN_VALUE;
    int curr = 0;
    // Integer.MIN_VALUE;
    int Array[] = { 1, 2, 3, 4, 5 };
    for (int i = 0; i < Array.length; i++) {
      for (int j = i; j < Array.length; j++) {
        curr = 0;
        for (int k = i; k <= j; k++) {

          curr += Array[k];

        }
        System.out.println(curr);
        if (curr > Sum) {
          Sum = curr;
        }
        // System.out.print(Array[k]);
        // System.out.println(curr);

      }
      // System.out.print(" ");
    }
    System.out.println("  " + Sum);
  }
  // System.out.println(" ");
}
