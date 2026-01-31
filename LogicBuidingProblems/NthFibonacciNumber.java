package LogicBuidingProblems;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        printFibonacciSeries(9);
        nthFibonacci(9);
    }
    static void printFibonacciSeries(int n){
       
        if (n <= 0) return;
        if (n == 1) {
        System.out.print(1);
        return;
        }

        int a = 1;
        int b = 1;
        
        System.out.print(a+", "+b);
        for(int i = 2; i<n ;i++){
            int c = a+b;
            a = b;
            b = c;
            System.out.print(", "+c);
            
        }
        System.out.println();
        
    }

    static void nthFibonacci(int n){

        if (n <= 0) return;
        if (n == 1 || n ==2) {
        System.out.print(1);
        return;
        }

        int a = 1;
        int b = 1;
        int c = 0;
        for(int i = 3; i<=n ;i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println("Nth Fibonacci Term : "+c);
        
    }
}
