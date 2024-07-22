package ARRAYS;

public class Binsrh {
  public static void main(String[] args) {
    
  
  int Array[]={1,2,3,4,5,6,7};
  int key=6;
  
int start=0;
int end=Array.length-1;


  while(start<=end ){
    int mid=(start+end) / 2;
    if(Array[mid]==key){
      System.out.println("The Index IS: = "+mid);
    }
    if(Array[mid]<key){
      start=mid+1;
    }
    else{
      end=mid-1;
    }

  }
}
}
