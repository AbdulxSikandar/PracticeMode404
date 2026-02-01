package LogicBuidingProblems;

public class DigitalRoot {
    public static void main(String[] args) {
        calculateDigitalRoot(1452);
        System.out.println(calculateDigitalRoot(1452));
    }
    static int calculateDigitalRoot(int x){

        if(x%9==0){
            return 9;
        }
        return x%9;
    }
    
}

/*
Time Complexity: O(1)
Auxiliary Space: O(1)


Formula Explaination : 

Digital Root:
Repeatedly sum digits until one digit remains.

We know that every number in the decimal system can be expressed as a sum of its digits multiplied by powers of 10. 
For example, a number represented as abcd can be written as follows:

abcd = a*10^3 + b*10^2 + c*10^1 + d*10^0   

We can separate the digits and rewrite this as:
abcd = a + b + c + d + (a*999 + b*99 + c*9)
abcd = a + b + c + d + 9*(a*111 + b*11 + c)

This implies that any number can be expressed as the sum of its digits plus a multiple of 9.
So, if we take modulo with 9 on each side, 
abcd % 9 = (a + b + c + d) % 9 + 0

This means that the remainder when abcd is divided by 9 is equal to the remainder where the sum of its digits (a + b + c + d)
is divided by 9.


*/