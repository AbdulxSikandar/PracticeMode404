package LogicBuidingProblems;

public class PrimalityTest {
    public static void main(String[] args) {
        checkPrime(1043);
        System.out.println(checkPrime(1043));
    }
    static boolean checkPrime(int x){
        if(x<=1){
            return false;
        }
//       for(int i=2;i < x-1;i++){                    // Time Complexity ---> O(n)
        for(int i=2;i*i <= x-1;i++){                  // Time Complexity ---> O(√n)
            if(x%i==0){
                return false;
            }
            
        }
        return true;
    }
}

/*
Time complexity: O(n)       i< x-1
Time Complexity: O(√n)      i*i<= x-1

Auxiliary Space: O(1)
*/
