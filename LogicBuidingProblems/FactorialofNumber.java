package LogicBuidingProblems;

public class FactorialofNumber {
    public static void main(String[] args) {
        factorialbyloop(5);
        factorialbyRecurrision(4);
        System.out.println("Factorial : "+factorialbyRecurrision(6));
    }
    
    static void factorialbyloop(int x){
        int factorial = 1;
        if (x == 0 || x == 1){
            factorial = 1;
        }
        for( int i = x; i>1;i--){
            factorial = factorial*i;
        }
        System.out.println("Factorial : "+factorial);
    }

    static int factorialbyRecurrision(int y){
        if (y == 0 || y == 1)
            return 1;
        return y * factorialbyRecurrision(y-1);

    }
}


/*

Iterative approach is better as the recursive approach requires extra space for recursion call stack and overhead of recursion calls.
 
Iterative Solution 
 Time : O(n)  
 Space : O(1) 
 
 Recursive Solution 
 Time : O(n)  
 Space : O(n) 

*/