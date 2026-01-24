package ProblemQuestion;

public class PalindromeArray {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,2,1};

        checkPalindrome(arr);
    }

    public static void checkPalindrome(int [] x){
        int left = 0;
        int right = x.length - 1;
        boolean palindrome = true ;

        while (left < right) {

            if (x[left]==x[right]) {
                left++;
                right--;
            } else {
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("Array is Palindrome");
        }else{
            System.out.println("Array is not a palindrome");
        }
    
    }
    
}
