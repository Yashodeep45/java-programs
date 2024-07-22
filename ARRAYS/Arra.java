package ARRAYS;

import java.util.Scanner;

public class Arra {
  public static void main(String[] args) {
    int marks[]=new int[50];
    Scanner sc=new Scanner(System.in);
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();

    System.out.println("1 ="+marks[0]);
    System.out.println("2 ="+marks[1]);
    System.out.println("3 ="+marks[2]);
    int per=(marks[0]+marks[1]+marks[2]);
   System.out.println((marks[0]+marks[1]+marks[2])/3);
   System.out.println(marks.length);
  }
}
