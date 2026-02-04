package LogicBuidingProblems;

public class CalculatenCr {

    public static void main(String[] args) {
        System.out.println(calnCr(5,3));
        System.out.println(binomialcoefficientformula(5,2));
    }

    static long calnCr(int n, int r){
        return (factorial(n)/(factorial(r)*factorial(n-r)));
    }
    
    static long factorial(int x){

        int factorial = 1;

        if(x==0 || x==1){
            factorial = 1;
        }
        for(int i = x; i>0; i--){
            factorial = factorial*i;
        }

        return factorial;
    }

    static long binomialcoefficientformula(int n, int r){

        double sum = 1;
        for (int i = 1; i <= r; i++) {
            sum = sum * (n - r + i) / i;
        }

        return (long)sum;
    }
}


/*
Time Complexity : O(n) 
Space Complexity : O(1)
*/