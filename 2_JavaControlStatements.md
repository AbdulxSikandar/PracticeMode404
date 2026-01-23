## Java Control Statements :
Java complier excute code from top to bottom and execute according to the order they appear.

1. Decision Making Statement:

        A. If Statement: 

                If (X > 10){
                    System.out.print(x);
                }
        B. IF-else Statement:
                If (X >= 10){
                    System.out.print(x);
                }else{
                    System.out.print("Try again");
                }

        C. If-Else If Statement : 
                If (X > 10){
                    System.out.print("Value is greater than variable");
                }else if( X = 10 ){
                    System.out.print("Value is equals to variable");
                }else {
                    System.out.print("Value is less than variable");
                }
        D. Nested If-else :
                If (X > 18){
                    If(Gender =='Male'){
                        System.out.println("Ride a Bike");
                    }else{
                        System.out.println("Ride a Scooty");
                    }
                    System.out.print("Value is greater than variable");
                }else {
                    System.out.print("Not allowed to ride a Bike/Scooty");
                }

        E. Switch Statement : 
            Switch( day){
                case 1 :
                  System.out.println("Day 1 : Monday");  
                  break;
                case 2 :
                  System.out.println("Day 2 : Tuesday");  
                  break;
                case 3 :
                  System.out.println("Day 3 : Wednesday");  
                  break;
                case 4 :
                  System.out.println("Day 4 : Thursday");  
                  break;
                case 5 :
                  System.out.println("Day 5 : Friday");  
                  break;
                default:
                    System.out.println("Weekend or Off-day")
            }
2. Loop Statement :

        A. do while loop :
            Useful if we want to execute condition irrespective of true/false then use do - while.
            do {
                System.out.println("Number : " + i );
                i ++;
            }
            while (i <= 10){
                System.out.println("Number : " + i );
            }

        B. While loop : (If we are not having number of iterations | We have termination condition)
            # factorial Program
            int factorial = 1; number = 5; temp_num = 0;
            temp_num = number;
            While(temp_num !=0){
                factorial = factorial * temp_num;
                -- temp_num ;
            }

        C. for loop :  ( Index based access of elements | We have a start point and End Point)
            for (int i = 0; i <=10; i++>){
                System.out.println("Number : " + i );
            }

        D. for each loop: ( Used to traverse Array or collection)
            Int[] arr = { 1,2,3,4,5,6};
            for (int a : arr){
                System.out.println("Number : " + a );
            }

3. Jump Statement:

        A. break
            used to break the loop
            
        B. Continue
            used to skip one iteration
        
        C. return 

            public static int greater( int x; int y){
                if (x > y){
                    System.out.println("Greatest Number : " + x );
                }else{
                    System.out.println("Greatest Number : " + y );
                }
            }
        D. Exit 
            System.exit(0) --- Successful Termination
            System.exit(1) --- UnSuccessful Termination
            System.exit(-1) --- UnSuccessful Termination with exception
