/*  
Author Name : SIKANDER
Date : 14 Dec 2025
Reson for Code : Java Selenium Learning
What Code will do : Stong the Conecpt of Java Selenium Automation
*/

/*

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



*/
public class S2labs{
    static int x = 5; // Static Variable

    public static void main( String[] args){
        int p = 10; // instance variable
                System.out.println(x+ p);
    }

    void test(){
        int z = 55; // Local variable
        System.out.println("Local variable : "+ z);
    }

/*
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

Reserved words : some words are reserved in java which can not be as identifier.



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
     

*/



}