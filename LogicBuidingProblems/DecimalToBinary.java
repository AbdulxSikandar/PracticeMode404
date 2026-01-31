package LogicBuidingProblems;

public class DecimalToBinary{
    public static void main(String[] args) {
        System.out.println(dectoBinary(15));
        
    }
    static String dectoBinary(int n){

        StringBuilder binary = new StringBuilder();

        while (n>0){
            int bit = n%2;
            binary.append(bit);
            n /=2;
        }

        // reverse the string
        binary.reverse();
        return binary.toString();

    }
}