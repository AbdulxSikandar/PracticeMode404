package ProblemQuestion;

public class RotateArrayKsteps {
    public static void main(String[] args) {
        int rotatestep = 3;
        int arr [] = {2,5,6,7,8,3,9};
        //rotateLeftKstepsBrute(arr, rotatestep);
        //rotateRightKstepsBrute(arr, rotatestep);
        //rotateLeftKstepsReverseMethod(arr, rotatestep);
        rotateRighttKstepsReverseMethod(arr, rotatestep);
    }
    
    public static void rotateLeftKstepsBrute(int [] x, int k){
        int n = x.length;
        k = k%n;

        if(x == null || x.length == 0) return;

        // Store the Elements which we have to left rotate into a new array
        int [] temp = new int[k];
        for(int i = 0; i<k;i++){
            temp[i]=x[i];
        }

        // move the Elements k places ahead in array 
        for(int j = k; j<n;j++){
            x[j-k] = x[j];
        }

        int q = 0;
        // add back the temporary stored elements back in the original array
        for(int p = n-k;p<n;p++){
            x[p]=temp[q];
            q++;
        }

        for(int p : x){
            System.out.print(p + " ");
        }
    }

    public static void rotateRightKstepsBrute(int [] x, int k){
        
        if(x == null || x.length == 0) return;
        
        int n = x.length;
        k = k%n;

        // Storing Right side  k elements in temp array
        int j = 0;
        int [] temp = new int[k];
        for(int i = n-k;i<n;i++){
            temp[j]=x[i];
            j++;
        }

        //shift first 
        for(int l = 1;l<=n-k;l++){
            x[n-l]= x[n-k-l];
        }
      

        // add back to K elements at first in aaray

        for(int m = 0; m<k;m++){
            x[m] = temp[m];
        }

        for ( int p : x){
            System.out.print(p + " ");
        }
    }

    public static void rotateLeftKstepsReverseMethod(int [] x, int k){
        
        if(x == null || x.length == 0) return;
        
        int n = x.length;
        k = k%n;
        
        reverseArray(x, 0, k-1);
        reverseArray(x, k, n-1);
        reverseArray(x, 0, n-1);

        for(int i : x){
            System.out.print(i + " ");
        }
    }

    public static void rotateRighttKstepsReverseMethod(int [] x, int k){
        
        if(x == null || x.length == 0) return;
        
        int n = x.length;
        k = k%n;


        reverseArray(x,0,n-k-1);
        reverseArray(x, n-k, n-1);
        reverseArray(x, 0, n-1);

        for(int i : x){
            System.out.print(i + " ");
        }



    }

    public static void reverseArray(int[] x, int y,int z ){

        int start = y;
        int end = z;

        while (start<end) {
            int temp = x[end];
            x[end] = x [start];
            x[start]=temp;

            start++;
            end--;

        }
        

    }

}
