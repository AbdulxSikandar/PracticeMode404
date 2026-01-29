package LogicBuidingProblems;

public class LCMoftwo {
    public static void main(String[] args) {
        calculateLCM(30,15);
    }
    static void calculateLCM(int x, int y){

        //Bigger Number
        int g = Math.max(x, y);

        //Smaller Number
        int s = Math.min(x, y);

        for( int i=g; i< x*y;i+=g){
            if(i%s==0){
                System.out.println("LCM is : "+i);
                break;
            }
        }
    }   
    
}
