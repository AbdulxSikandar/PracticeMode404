## Methods : 
        A method in Java is a block of code that:

        - Performs a specific task
        - Runs only when it is called
        - Helps in code reusability, readability, and maintainability

        Methods represent the behavior of an object or class.

        Why Do We Need Methods?
            ✔ Avoid code duplication
            ✔ Improve modularity
            ✔ Easy debugging & testing
            ✔ Better readability

        Syntex : 

        access_modifier return_type method_name(parameter_list) {
            //method body
        }

        access_modifier  ---> public, private, protected
        return_type ---> void, int, string etc
        method_name ---> any relevant name
        parameter_list ---> whatever parameter it is going to take


    Types of Methods : 

    1. Predefined (Built-in) Methods :
        Methods provided by Java API.

        System.out.println("Hello");
        Math.sqrt(16);
        array.length;



    2.User-Defined Methods : 
        Methods created by programmers.

        void greet() {
            System.out.println("Welcome");
        }


    3. Static Methods : 

        - Declared using static
        - Called using class name
        - Cannot use this

        static void display() {
            System.out.println("Static method");
        }

    4. Instance Methods (Non-Static) : 

        - Belong to object
        - Need object to call

        void show() {
            System.out.println("Instance method");
        }

        obj.show();


        | Aspect                        | Static Method                         | Non-Static (Instance) Method         |
        | ----------------------------- | ------------------------------------  | ------------------------------------ |
        | **Definition**                | Method that belongs to the **class**  | Method that belongs to an **object** |
        | **Keyword**                   | Declared using `static`               | No `static` keyword                  |
        | **Access**                    | Accessed using **class name**         | Accessed using **object reference**  |
        | **Object Required**           | ❌ Not required                      | ✔ Required                           |
        | **Access Static Members**     | ✔ Yes                                | ✔ Yes                                |
        | **Access Non-Static Members** | ❌ No                                | ✔ Yes                                |
        | **Binding Time**              | **Compile-time binding**              | **Runtime binding**                  |
        | **Overriding**                | ❌ Not overridden (Method Hiding)    | ✔ Can be overridden                  |
        | **Polymorphism**              | ❌ Not supported                     | ✔ Supported                          |
        | **Memory Allocation**         | Method Area / Metaspace               | Heap (with object)                   |
        | **Number of Copies**          | One per class                         | One per object                       |
        | **`this` keyword**            | ❌ Cannot be used                    | ✔ Can be used                        |
        | **`super` keyword**           | ❌ Cannot be used                    | ✔ Can be used                        |
        | **Performance**               | Faster (no object lookup)             | Slightly slower                      |
        | **Main Use Case**             | Utility / helper logic                | Business / object behavior           |
        | **Example**                   | `Math.max()`                          | `account.withdraw()`                 |



        Why static methods cannot directly use non-static variables : 

            A static method belongs to the class, while a non-static variable belongs to an object.
            So inside a static method:
            There is no object

            class Test {
                int x = 10;

                static void show() {
                    System.out.println(x); // ❌ Compile-time error
                }
            }

            Error: Cannot make a static reference to a non-static field

            Ways to use a non-static variable inside a static method : 

            1. Create an Object (Most Common & Correct Way)

            class Test {
                int x = 10;

                static void show() {
                    Test obj = new Test();   // create object
                    System.out.println(obj.x);
                }

                public static void main(String[] args) {
                    show();
                }
            }

            2. Pass Object as a Parameter (Best Design Practice)

            class Test {
                int x = 10;

                static void show(Test obj) {
                    System.out.println(obj.x);
                }

                public static void main(String[] args) {
                    Test t = new Test();
                    show(t);
                }
            }

            3. Call Static Method from Instance Method (Indirect Access)

            class Test {
                int x = 10;

                static void show(Test obj) {
                    System.out.println(obj.x);
                }

                void call() {
                    show(this);  // instance method has object
                }

                public static void main(String[] args) {
                    Test t = new Test();
                    t.call();
                }
            }

            

            ❌ Using this in static method

            static void show() {
                System.out.println(this.x); // ❌ ERROR
            }


            ❌ Accessing instance variable directly
            static void show() {
                System.out.println(x); // ❌ ERROR
            }

    Method Overloading (Compile-Time Polymorphism) : 

        Same method name, different parameters.

        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

    Method Overriding (Runtime Polymorphism) : 

        Same method name & signature in child class.

        class Parent {
            void show() {}
        }

        class Child extends Parent {
            void show() {}
        }


    Accessor Method (Getter) : 
        An accessor method is used to:
            - Read / access the value of instance variables
            - Not modify the data
            - Commonly called Getter methods

        Characteristics

            ✔ Usually public
            ✔ Has a return type
            ✔ Does not change object state
            ✔ Follows naming convention: getVariableName()

        Example :
        class Student {
            private int age;

            public int getAge() {   // Accessor
                return age;
            }
        }


    Mutator Method (Setter) : 
        A mutator method is used to:

            Modify / update the value of instance variables
            Commonly called Setter methods

        Characteristics :

            ✔ Usually public
            ✔ Return type is usually void
            ✔ Accepts parameters
            ✔ Follows naming convention: setVariableName()

        Example :
        class Student {
            private int age;

            public void setAge(int age) {  // Mutator
                this.age = age;
            }
        }


    | Aspect               | Normal Method | Abstract Method |
    | -------------------- | ------------- | --------------- |
    | Implementation       | Present       | Missing         |
    | Enforcement          | ❌ Optional   | ✔ Mandatory    |
    | Design contract      | ❌            | ✔              |
    | Polymorphism support | Weak          | Strong          |
    | Compile-time safety  | ❌            | ✔              |


    Abstract Method : 
        An abstract method is a method that:
            - Is declared using the abstract keyword
            - Does not have a method body
            - Specifies what to do, not how to do

        Where Can Abstract Methods Exist?

            ✔ Only inside an abstract class
            ❌ Cannot be inside a normal (concrete) class

            abstract class Vehicle {
                abstract void move();
            }

            class Car extends Vehicle {
                @Override
                void move() {
                    system.out.println("Will move on 4 wheels");
                }
            }

            class Bike extends Vehicle {
                @Override
                void move() {
                    system.out.println("Will move on 2 wheels");
                }
            }
            class Auto extends Vehicle {
                @Override
                void move() {
                    system.out.println("Will move on 3 wheels");
                }
            }


        Rules of Abstract Methods ⚠️

            ✔ Must be declared using abstract
            ✔ Must not have a body
            ✔ Subclass must implement all abstract methods    //// if we are extending abstract class then we have to define all the abstract call methods by overiding them
            ✔ Cannot be private, final, or static
            ✔ Can have parameters & return type

        Why Do We Use Abstract Methods?

            ✔ Enforce method implementation
            ✔ Achieve runtime polymorphism
            ✔ Define common behavior
            ✔ Follow OCP (Open–Closed Principle)
        
        Use abstract methods when:

            ✔ Multiple classes share common behavior
            ✔ Logic differs per class
            ✔ You want to force implementation
            ✔ You are designing a framework / API
            ✔ You want future-proof code

        Abstract methodsexist so that:

            ✔ Humans don’t forget
            ✔ Compiler enforces rules
            ✔ Architecture remains scalable

        # Abstract methods are not about code reuse. They are about design discipline.

        Example : 
        abstract class Bank {
            abstract double getInterestRate();
        }

        class SBI extends Bank {
            double getInterestRate() {
                return 6.5;
            }
        }

        class HDFC extends Bank {
            double getInterestRate() {
                return 7.0;
            }
        }

    Can we create object of abstract class?  ---> ❌ NO
    Can abstract method be overridden? ---> ✔ YES (mandatory)
    Can abstract method be static? ---> ❌ NO
    Can abstract class have no abstract methods? ---> ✔ YES


    Abstract methods are NOT about making code run.
    They are about design guarantees.

    Abstract methods exist to ENFORCE A CONTRACT

        Not to store logic.
        Not to reuse code.
        But to force correctness at compile time.

        “Any class that claims to be a Shape MUST have an area() method.”

        That’s the only special power abstract methods give.

        Abstract Method = Legal Contract
        Concrete Method = Actual Implementation

