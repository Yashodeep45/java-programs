package ARRAYS;

public class Argue {

  public static void update(int mar[],int n){
    for(int i=0;i<mar.length;i++){
      mar[i]=mar[i]+1;
    }
    mar[2]=n+mar[2];
    int num=1;
    for(int i=0;i<mar.length;i++){
      mar[i]=num++;
      //num++;
    }
    for(int i=0;i<mar.length;i++){
      
    }
  }
  public static void main(String[] args) {
    int marks[]=new int[5] ; //={90,96,97};
    //update(marks);
   for(int i=0;i<marks.length;i++){
      System.out.println(marks[i]);
   }
    System.out.println(" ");



    update(marks,5 );
    for(int i=0;i<marks.length;i++){
    System.out.println(marks[i]);}
    
   // marks[2]=35;
   // System.out.println(marks[2]);
  }
}
