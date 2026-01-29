package LogicBuidingProblems;

public class isPower {
    public static void main(String[] args) {
        checkpower(4,16);
        System.out.println(checkpower(2,16));
    }
    static boolean checkpower(int x, int y){

        while(y>1){
            if(y%x !=0){
                return false;
            }
            y = y/x;
        }
        return true;
    }
}
