package TwoPointers;

public class ContainerWithMost {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,8,9,10};

        calculateWater2(arr);
    }

    //if array is Sorted
    static void calculateWater1(int[] x){

        int maxwater = 0;
        int a = 0;
        int b = x.length-1;
        while (a<b) {
            int width = b-a;
            int water = width * Math.min(x[a],x[b]);
            maxwater = Math.max(water, maxwater);

            // move smaller height pointer
            if (x[a] < x[b]) {
                a++;        
            } else {
                b--;      
            }
        }
        System.out.println(maxwater);

        
    }


    static void calculateWater2(int [] x){

        int water = 0;

        for(int i =0; i<x.length;i++){
            for(int j = i+1;j<x.length;j++){
                int width = j-i;
                int height = Math.min(x[i], x[j]);
                int area = width*height;

                if(area > water){
                    water = area;
                }

            }
        }

        System.out.println("Max Water in Container : "+water);
    }
}
