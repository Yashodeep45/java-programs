package ARRAYS;

public class Binrysrh {

  public static void main(String[] args) {
    int Array[] = { 1, 2, 3, 4, 5, 7 };
    int key = 7;
    int start = 0;
    int end = Array.length - 1;
    System.out.println(end);
    while (start <= end) {
      int mid = (start + end) / 2;
      if (Array[mid] == key) {
        System.out.println(mid);
      }
      if (Array[mid] > key) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

  }

}
