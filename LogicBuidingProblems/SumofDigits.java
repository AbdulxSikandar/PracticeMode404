package LogicBuidingProblems;
public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(digitsSum(123786));
        digitSum(2345);
    }

    static int digitsSum(int n){
        String num = String.valueOf(n);
        int sum =0;
        for(int i =0;i<num.length();i++){
            char chars = num.charAt(i);
            int x = Integer.parseInt(String.valueOf(chars));
            sum += x;
        }
        return sum;
    }
    
    static void digitSum(int x){
        int sum =0;
        while(x != 0){
            sum += x % 10;
            x = x / 10;
        }
        System.out.println(sum);
    }   
    
}
