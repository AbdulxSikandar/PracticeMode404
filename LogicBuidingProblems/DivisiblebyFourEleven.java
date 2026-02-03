package LogicBuidingProblems;

public class DivisiblebyFourEleven {
    public static void main(String[] args) {
        checkDivisibleby4(144);
        divBy4last2digits(1787844452);
        
        
    }

    static void checkDivisibleby4(int x){

        if(x%4==0){
            System.out.println(x+ " is divisble by 4. ");
        }else{
            System.out.println(x+ " is not divisble by 4. ");
        }
    }

    static void divBy11(int x){
        if(x%11==0){
            System.out.println(x+ " is divisble by 11. ");
        }else{
            System.out.println(x+ " is not divisble by 11. ");
        }
    }
    
    static void divBy4last2digits(long x){

        String s = String.valueOf(x);
        int length = s.length();

        int lastdigit = s.charAt(length-1)-'0';
        int slastdigit = s.charAt(length-2)-'0';

        int last2digit = slastdigit*10+lastdigit;
        System.out.println(last2digit);

        if(last2digit%4==0){
            System.out.println(x+ " is divisble by 4. ");
        }else{
            System.out.println(x+ " is not divisble by 4. ");
        }
    }

}

/*
Time Complexity - O(1)
Auxiliary Space - O(1)
*/
