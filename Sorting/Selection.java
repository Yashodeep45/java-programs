package Sorting;

public class Selection {
  public static void main(String[] args) {
    int Array[] = { 5, 2, 3, 1, 4 };
    for (int n = 0; n < Array.length - 1; n++) {
      int minpos = n;
      for (int i = n + 1; i < Array.length; i++) {
        if (Array[minpos] > Array[i]) {
          minpos = i;
        }
      }
      int temp = Array[minpos];
      Array[minpos] = Array[n];
      Array[n] = temp;

    }
    for (int j = 0; j < Array.length; j++) {
      System.out.print(Array[j]);
    }
    System.out.println(Array.length);

  }
}
