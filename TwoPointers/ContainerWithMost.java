package TwoPointers;

public class ContainerWithMost {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,8,9,10};

        calculateWater(arr);
    }

    //if array is Sorted
    static void calculateWater(int[] x){

        int maxwater = 0;
        int a = 0;
        int b = x.length-1;
        while (a<b) {
            int width = x[b]-x[a];
            int water = width * Math.min(x[a],x[b]);
            if(maxwater<water){
                maxwater = water;
            }
            a++;
        }
        System.out.println(maxwater);

        
    }
}
