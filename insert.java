public class insert {
    public static void main(String[] args) {


        int a[] = new int[5];
       a[0]=1;a[1]=3; a[2]=5;a[3]=7;
       int ins=4;
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]);
        }
       for(int i=a.length-2;i<2;i--){
           int temp=a[i];
           a[i+1]=a[i];
           a[i]=temp;
           a[2]=ins;
       }
       for(int j=0;j<a.length;j++){
           System.out.print(a[j]);
       }





    }
}
