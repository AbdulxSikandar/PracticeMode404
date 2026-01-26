package ProblemQuestion;

public class Minimumcost {

    public static void main(String[] args) {
        int [] arr = {4,3,6,7,8,9,1,5,6};
        mincostfunction(arr);
    }
    
    static void mincostfunction(int [] x){
        if(x == null || x.length ==0){
            return;
        }

        int n = x.length;
        int min = x[0];
        for(int i = 1;i<n;i++){
            if( x[i]<min){
                min = x[i];
            }
        }
        int mincost = (n-1)*min;
        System.out.println("minimum cost to reduce array size to 1 : "+mincost);
    }
}


/*
Time : O(n)
Space : O(1)
*/