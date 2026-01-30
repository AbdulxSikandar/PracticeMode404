package LogicBuidingProblems;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(6));
    }

    static boolean checkPerfectNumber(int x){
        int sumofperfectdivisor = 0;

        for (int i = 1;i<x-1;i++){
            if(x%i==0){
                sumofperfectdivisor += i;
            }
        }
        if (sumofperfectdivisor == x) {
            return true;
        }
        return false;
    }   
    
}

/*
Time : O(n)
Space : O(1)

*/




/*

Perfect Number
A number is a perfect number if it is equal to the sum of its proper divisors, that is, 
the sum of its positive divisors excluding the number itself.

Facts :
1) Every even perfect number is of the form 2p−1⋅(2p−1) , where 2p−1 is a prime number.
2) It is unknown whether there are any odd perfect numbers.

*/