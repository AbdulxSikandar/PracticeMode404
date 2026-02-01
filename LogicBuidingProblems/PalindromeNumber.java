package LogicBuidingProblems;

public class PalindromeNumber {

    public static void main(String[] args) {
        isPalindrome(12321);
    }

    static void isPalindrome(int x){
        if (x < 0) {
            System.out.println("It's a Negative Number");
        };

        int temp = x;
        int rev = 0;

        while (temp>0) {

            rev = rev * 10 + temp%10;
            temp /=10;
        }

        if(x==rev){
            System.out.println("It's a Palindrome Number");
        }else{
            System.out.println("It's not a Palindrome Number");
        }
        

    }
    
}
