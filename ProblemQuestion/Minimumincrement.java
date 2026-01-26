package ProblemQuestion;

public class Minimumincrement {

    public static void main(String[] args) {
        int arr[] = { 21, 33, 9, 45, 63 };
        int  k = 3 ;
        findMinimumincrementnumbers(arr, k);
    }
    
    public static void findMinimumincrementnumbers(int[] x,int k){

        if(x==null || x.length == 0){
            return;
        }

        int n = x.length;
        int numberofOperations = 0;

        int max =x[0];
        for(int m = 1; m<n;m++){
            if(x[m]>max){
                max = x[m];
            }
        }
        
        for(int i = 0; i<n ; i++){
            if((max-x[i])%k==0){
                numberofOperations+= (max-x[i])/k;
            
            }else{
               
                numberofOperations = -1;
                break;
            }
        }
        System.out.println(numberofOperations);

    }
}
