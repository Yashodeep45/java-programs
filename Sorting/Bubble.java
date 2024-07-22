package Sorting;

public class Bubble {
  public static void Sort(int Arr[]) {
    for (int turn = 0; turn < Arr.length - 1; turn++) {
      for (int j = 0; j < Arr.length - 1 - turn; j++) {
        if (Arr[j] > Arr[j + 1]) {
          int temp = Arr[j];
          Arr[j] = Arr[j + 1];
          Arr[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < Arr.length; i++) {
      System.out.print(Arr[i] + " ");
    }

  }

  public static void main(String[] args) {
    int Array[] = { 5, 4, 3, 2, 1 };
    Sort(Array);
  }

}
