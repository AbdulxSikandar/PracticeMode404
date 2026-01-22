package ProblemQuestion;

public class RotateArrayKsteps {
    public static void main(String[] args) {
        int rotatestep = 2;
        int arr [] = {2,5,6,7,8,3,9};
        rotateKsteps(arr, rotatestep);
        
    }
    
    public static void rotateKsteps(int [] x, int y){
        y = y%x.length-1;

        for(int i =0;i<=y;i++){
           x[i] = x[x.length-1-i];
        }
        for(int p : x){
            System.out.print(p+" ");
        }
    }
}
