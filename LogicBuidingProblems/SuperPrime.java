package LogicBuidingProblems;

public class SuperPrime {
    public static void main(String[] args) {
        findSuperPrime(8);
    }
    static void findSuperPrime(int x){
        for(int i = 2;i<=x;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }

    static boolean prime(int y){
        if(y<=1){
            return false;
        }
        for(int i=2;i <= y-1;i++){                  
            if(y%i==0){
                return false;
            }
            
        }
        return true;
    }
    
}
