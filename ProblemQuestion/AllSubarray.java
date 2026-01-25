package ProblemQuestion;

public class AllSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        findallsubarraybyBruteForce(arr);
    }

    public static void findallsubarraybyBruteForce(int [] x){

        if(x == null || x.length == 0){
            return;
        }


        for(int startpoint =0; startpoint < x.length; startpoint++){
            for(int endpoint = startpoint; endpoint<x.length;endpoint++){
                for( int i =startpoint; i<= endpoint;i++){
                    System.out.print(x[i]+" ");
                }
                System.out.println();
            }
            
        }
    }
    
}

/*
Number of subarrays = n(n+1)/2 ≈ O(n²)

| Metric | Value |
| ------ | ----- |
| Time   | O(n³) |
| Space  | O(1)  |

Best Possible (Optimal) : processing (sum, max, count, etc.)     -----> | Time   | O(n²) |

*/
