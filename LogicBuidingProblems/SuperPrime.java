package LogicBuidingProblems;

import java.util.ArrayList;

public class SuperPrime {
    public static void main(String[] args) {
        findSuperPrime(241);
    }
    static void findSuperPrime(int x){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2;i<=x;i++){
            if(prime(i)){
                arr.add(i);
                System.out.print(i+" ");
            }
        }
        System.out.println();

        for(int j =1; j <= arr.size();j++){
            if (prime(j)){
                System.out.print(arr.get(j-1)+" ");
            }
        }
    }

    static boolean prime(int y){
        if(y<=1){
            return false;
        }
        
        for(int i=2;i*i <= y;i++){                  
            if(y%i==0){
                return false;
            }
            
        }
        return true;
    }
    
}
