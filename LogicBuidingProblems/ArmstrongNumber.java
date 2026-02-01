package LogicBuidingProblems;

public class ArmstrongNumber {
    public static void main(String[] args) {
        checkArmstrongNumber (153);
    }

    /*
    static void checkArmstrongNumber(int x){

        int temp = x;
        int sum = 0;
        int n = String.valueOf(x).length();
        int remainder;

        for ( int i = 0;i<n;i++){
            remainder = temp%10;
            sum += Math.pow(remainder, n);
            temp = temp/10;
        }
        
        if(sum==x){
            System.out.println("Given Number "+x+" is a Armstrong Number");
        }else{
            System.out.println("Given Number "+x+" is not a Armstrong Number");
        }   
    }
    */

    static void checkArmstrongNumber(int x) {

        int temp = x;
        int digits = 0;
        int sum = 0;

        // Count digits
        int countTemp = x;
        while (countTemp > 0) {
            digits++;
            countTemp /= 10;
        }

        // Calculate Armstrong sum
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }

        if (sum == x) {
            System.out.println(x + " is an Armstrong Number");
        } else {
            System.out.println(x + " is not an Armstrong Number");
        }
    }

}
