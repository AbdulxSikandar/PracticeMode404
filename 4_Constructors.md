## Constructor :
A constructor is a special method used to initialize objects in Java.
    Key Characteristics
        - Constructor name = Class name
        - No return type (not even void)
        - Automatically called when an object is created using new
        - Used to initialize instance variables
        - There can be multiple constructor in a class with different-different parameters and with same name.

        class Student {
            int id;
            String name;

            Student() {                        // Constructor Name Same as Class name
                System.out.println("Constructor called");
            }
        }

        Core Rule : 

        - The first statement inside a constructor must be either this() or super().
        this() → calls another constructor of the same class
        super() → calls parent class constructor
        - If you don’t write either, the compiler automatically inserts super() (no-argument).

        class Parent {
            Parent() {
                System.out.println("Parent constructor");
            }
        }

        class Child extends Parent {
            Child() {
                System.out.println("Child constructor");
            }
        }


        What compiler does internally : 

        class Child extends Parent {
            Child() {
                super(); // compiler adds this automatically
                System.out.println("Child constructor");
            }
        }

        ✔ Parent constructor is called first
        ✔ Then child constructo

    Parent has ONLY parameterized constructor : 

    class Parent {
        Parent(int x) {
            System.out.println("Parent constructor: " + x);
        }
    }

    class Child extends Parent {
        Child() {
            System.out.println("Child constructor");
        }
    }

    // constructor Parent() is undefined 
    // Compile-time error ( Compiler tries to insert super(), But no no-arg constructor exists )

    Correct Child class : 

    class Child extends Parent {
        Child() {
            super(10);     // must explicitly call parameterized constructor bcz no argument parameter can be added by java automatically but with argument we have to add
            System.out.println("Child constructor");
        }
    }


    Types of Constructors : 

    1. Default Constructor : 
        If We do not define any constructor, Java provides one.

    2. No-Argument  :
        A constructor with no parameters written by the programmer.

        class Employee {
            Employee() {
                System.out.println("No-arg constructor");
            }
        }

    3. Parameterized Constructor
        A constructor that accepts parameters.
        
        class Employee {
            int id;
            Employee(int id) {
                this.id = id;
            }
        }

