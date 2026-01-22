package ProblemQuestion;

public class Secondlargetelement {
    public static void main(String[] args) {
        int[] arr = { 1,41,8,9,12,15,16,19,7};
        secondmax(arr);
    }

    public static void secondmax(int [] x){
        if(x == null || x.length == 0){
            throw new IllegalArgumentException(" Array must not be empty");
        }
        int max = 0;
        int smax =0 ;
        for(int i =0;i<x.length;i++){
            if(x[i]>max){
                smax = max;
                max = x[i];
            } else if( x[i]> smax && x[i]< max){
                    smax = x[i];
            }
        }
        System.out.println("Max from array : " + max + " Second Max from array : "+smax);
    }
    
}
