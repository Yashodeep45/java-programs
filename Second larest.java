public class Max {

    public static void main(String[] args) {
        int numarr[]={5,3,4,6,7};

        int max=numarr[0];
        int max2=numarr[0];
        for(int i=0;i< numarr.length;i++){
            if(numarr[i]>max){
                max2=max;
                max=numarr[i];

            }

            else if(numarr[i]>max2){
                max2=numarr[i];
            }
        }
        System.out.println("MAX="+max);
        System.out.println("MAX2="+max2);
    }


}



