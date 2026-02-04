package LogicBuidingProblems;

/*
Given two numbers, n and r, the task is to compute nPr, which represents the number of ways to arrange
r elements from a set of n elements. It is calculated using the formula n!/(n−r)!, where "!" denotes the factorial operation.

nPr = n! / (n - r)! 

*/

public class CalculatenPr {

    public static void main(String[] args) {
        calnPr(6, 3);
    }

    static void calnPr(int n, int r){

        long npr = factorialbyloop(n)/factorialbyloop(n-r);

        System.out.println(npr);
        
    }
    static long factorialbyloop(int x){
        int factorial = 1;
        if (x == 0 || x == 1){
            factorial = 1;
        }
        for( int i = x; i>1;i--){
            factorial = factorial*i;
        }
        return factorial;
    }
}
