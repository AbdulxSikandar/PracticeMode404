# PracticeMode404


JAVA Notes

Author Name : SIKANDER
Date : 14 Dec 2025
Reson for Code : Java Selenium Learning
What Code will do : Stong the Conecpt of Java Selenium Automation



JAVA
1991 -- Sun Microsystem,USA   / James Gosling

Purly Object Oriented Language

Source Code-----> Complied to ---> Byte Code ----> Interpreted ----> Machine Code

Class & Object
Inheritence
Polymorphisim
Abstruction
Encapculation

Platform Independent

Primitive Data type and Non Premitive Data type

byte --> Short -> int --> Long --> float --> double---> boolean   ||  char
Size    2 byte    4 byte   8 byte  4 byte      8byte

String[] args ---> JVM Standard to pass Arguments and It takes arguments as String
int[] args -- > x incorrect why of passing argument by commend line argument


String [] args -- ok
String args [] -- ok

Simple Language : User friendly Syntex
High Level Language : Plan text / User understandable code
Platform Independent: Once wrote the code then it can be executed on any plateform like machine/mac/linux/windows  (JVM of any plateform)
Interpreted ---> byte code is interpreted into machine code



Before creating any program, JDK must be properly installed in our system.
Write a Program on any IDE/Text Editor.
To compile the code, Java compiler (Javac) must run.
It will create a test.class file which contains byte code of the Program.
then we need Interpreter to run the code and JVM helps in that.

Every oprating system has different JVM.

JDK ---> JRE + JVM + Compiler + Java Docs + Java Debuggers

JRE ---> JVM + Applet + browser

JVM -- - > Virtual Machine + Garbage collector.


# Java Doesn't support muliple Inheritence but can be achieved by interfaces. 
# Java doesn't suppot Pointrt.



Java Variables : 

1. Local Variable
2. Instance Variable
3. Static Variable


Local Variable : Defined inside of a method/function
    # can only be used inside the method where it is defined.
    # Can not be defined with Static keyword. / Static keyword can not be used with Local variable.


Instance Vaiable : Declared outside the method and Inside a class.

Static Variable : Declared with static keyword. ( It can not be local variable.)
        #Memory allocation for static variable happens only once when the class is loaded in the memory.



        Int            x         =    6 ; 

        Data Type   Identifier       Literal

# Identifier ==> Name of variable/method/class/package/constant
# Literal ==> Values of Variable/constant

Reserved words : some words are reserved in java which can not be as identifier. (Static, Void, Final, Finally, Main etc)



Autoboxing : Convert primitive data type into their respective Wrapper classes.
            Reason : to perform operations on primitive data type

            int a = 5;
            Integer b = a;


Typecasting : Process of changing data type, Useful when we want to perform operation on different datatype or we want to store 
                value of one datatype into a different one.

                byte --> short --> int --> long --> float--> double --------------> Widening Type Casting // Implicit typecasting
                double --> float --> long --> int ---> short --> byte ------------> Narrowing Type Casting// Explicit typecasting

                double a = 15.9;
                int b = (int) a;

                int x = 14;
                double y = x;
     
# Java Control Statements :
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



# Final Keyword : 
    1. Final Variable :
        After initialization, cannot be modified or updated
        final int x = 5;

        If Try to modify then compile-time error
        final int x = 10;
        x = 20;   // ❌ Compile-time error

    2. Final Method : 
        Cannot be overridden by its subclass
        final  void display(){
            System.out.println("hello world");
        }

        If try to override the final method
        class Parent {
            final void show() {
                System.out.println("Parent show()");
            }
        }

        class Child extends Parent {
            @Override
            void show() {   // ❌ Compile-time error
                System.out.println("Child show()");
            }
        }

    3. Final Class : 
        Cannot be extended or inherited
        but we can modify/change the object of that class

        final class A { 

        }

        class B extends A {   
            // ❌ Compile-time error
        }
        
        -- Can we modify/change the object of a final class
        final class Person {
            int age;
        }

        Person p = new Person();
        p.age = 30;   // ✅ Allowed


# This Keyword : 
    - The this keyword refers to the current object and is used to access instance variables and methods. It cannot be used in static context.

    public class this_class {  
        int a = 5;
        int b = 10;
        public void greater( int x, int y){
                if (x > y){
                    this.a = x;
                    this.b = y
                    System.out.println("Greatest Number : " + x );
                }else{
                    System.out.println("Greatest Number : " + y );
                }
            }
    }

    - The this keyword is used to invoke methods of the current object (instance), not the class.
    
    class Test {
        void show() {
            System.out.println("Show method");
        }

        void display() {
            this.show();   // ✅ refers to current object
        }
    }


    - Used to invoke constructors of the current class

    class Test {
        Test() {
            this(10);   // ✅ calls parameterized constructor
            System.out.println("Default constructor");
        }

        Test(int x) {
            System.out.println("Parameterized constructor: " + x);
        }
    }


# Class 
A class in Java is a blueprint or template for creating objects. It is a fundamental component of the object-oriented programming (OOP) model, defining the structure and behavior that all objects of that class will share. 

    1. Concrete Class : 
    A normal class with full implementation.

    class Car {
        void run() {
            System.out.println("Car is running");
        }
    }

    2. Abstract Class : 
    A class declared using abstract keyword.
    ✔ Can have abstract & concrete methods
    ❌ Cannot create object directly
    ✔ Supports inheritance

    abstract class Vehicle {
        abstract void move();
    }



