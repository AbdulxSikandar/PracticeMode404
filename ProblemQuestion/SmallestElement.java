package ProblemQuestion;

public class SmallestElement {

    public static void main(String[] args) {
        int [] arr = { 1,5,7,9,5,8,3,4,11,12,6};
        findsmallestElement(arr);
        findsecondsmallestElement(arr);
    }
    
    public static void findsmallestElement(int [] x){
        if(x==null || x.length == 0){
            System.out.println("Array is Empty");
            return;
        }
        int smallestElement = x[0];

        for(int i =1; i<x.length;i++){
            if(x[i]<smallestElement){
                smallestElement = x[i];
            }
        }
        System.out.println("Smallest Element in Araay : "+smallestElement);

    }

    
    public static void findsecondsmallestElement(int [] x){
        
        if(x==null || x.length == 0){
            System.out.println("Array is Empty");
            return;
        }
        
        int smallestEle = Integer.MAX_VALUE;;
        int secondsmallestEle = Integer.MAX_VALUE;

        for ( int j = 0; j < x.length; j++){
            if(x[j]<smallestEle){
                secondsmallestEle = smallestEle;
                smallestEle = x[j];
            }else if (x[j]>smallestEle && x[j]<secondsmallestEle){
                secondsmallestEle = x[j];
            }
        }
        
        if (secondsmallestEle == Integer.MAX_VALUE) {
            System.out.println("No second smallest element exists");
        } else {
            System.out.println("Second Smallest Element: " + secondsmallestEle);
        }
        
    }
}

/*
Time & Space Complexity
⏱ Time Complexity
    findsmallestElement ---> O(n)
    findsecondsmallestElement ---> O(n)

Space Complexity ---> O(1)
*/