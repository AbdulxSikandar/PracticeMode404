package LogicBuidingProblems;

public class SumofSquares {
    public static void main(String[] args) {
        calculateSumOfSquares(6);
    }
    static void calculateSumOfSquares(int x){
        int sum = (x*(x+1)*(2*x+1)/6); 
        // to Avoiding the overflow and improve it more we can restructure it : (n * (n + 1) / 2) * (2 * n + 1) / 3;
        System.out.println("Sum of Squares of first "+x+" natural numbers : "+ sum);
    }
}
