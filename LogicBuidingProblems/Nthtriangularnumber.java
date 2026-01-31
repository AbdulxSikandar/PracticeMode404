package LogicBuidingProblems;

/*
Given a number n, find the n-th term in the series 1, 3, 6, 10, 15, 21...
The given series represent triangular numbers which are sums of natural numbers.
Sum of n natural numbers is = n(n+1)/2

*/
public class Nthtriangularnumber {

    public static void main(String[] args) {
        findNthTriangularNum(4);
    }
    static void findNthTriangularNum(int n){

        int number = n*(n+1)/2;

        System.out.println(number);
    }
}

/*
O(1) time and O(1) space
 */