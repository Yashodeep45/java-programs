class RotateRight {
    public static void main(String[] args) {
       
         int array[]={5,4,3,2,1};
       
            for(int r=1;r<4;r++){
             int temp=array[0];
       
      for (int i = 1;i < array.length;i++) { //using this to rotate n times
                array[i - 1] = array[i];
               }
            array[array.length - 1] = temp;
            }
   
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]);
        }
    
}
}