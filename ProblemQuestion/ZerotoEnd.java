package ProblemQuestion;

public class ZerotoEnd {

    //Move all Zeros to End of Array
    public static void main(String[] args) {
        int [] arr = {1, 0, 0, 4, 0, 0, 5, 0};
        moveZerosatEnd(arr);
        moveZeroinPlace(arr);
    }
    
    public static void moveZerosatEnd(int [] x){
         if(x == null || x.length == 0) return;

        int n = x.length;

        int [] temp = new int[n];
        int y = 0;
        for ( int i =0; i < n;i++){
            if(x[i]!=0){
                temp[y]=x[i];
                y++;
            }
        }
        
        for(int p : temp){
            System.out.print(p+" ");
        }
    }

    public static void moveZeroinPlace(int[] x){
        
        if(x == null || x.length == 0) return;
        int n = x.length;
        int index = 0;
        
        for ( int i = 0; i< n;i++){
            if(x[i]!=0){
                x[index] = x[i];
                index ++;
            }
        }
        while (index<n) {
            x[index] = 0;
            index++;
        }

        for(int p : x){
            System.out.print(p+" ");
        }
    
    }
}
