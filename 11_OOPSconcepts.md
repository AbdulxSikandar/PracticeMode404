## OOPS in Java –
    refers to Object-Oriented Programming (OOP), a coding style using "objects" (data + functions) to model real-world things, promoting reusable and organized code through concepts like Classes, Objects, Inheritance, Polymorphism, Encapsulation, and Abstraction. 

    Without OOPS → procedural → messy code
    With OOPS → modular, reusable, maintainable

    1️⃣ Class & Object (foundation)
    2️⃣ Encapsulation
    3️⃣ Inheritance
    4️⃣ Polymorphism 
    5️⃣ Abstraction


## 1️⃣ Class & Object (foundation)

            A Class is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type. 
            A class is a blueprint / template that defines:

            Properties (data / state) → variables
            Behaviors (actions) → methods
            ⚠️ A class does not occupy memory by itself.

            Example :
            class Car {
                String color;
                int speed;

                void drive() {
                    System.out.println("Car is driving");
                }
            }

        
            Object:

            An object is a real instance of a class.
            Car c1 = new Car();

            What happens internally?

            new Car() → Object created in Heap
            c1 → Reference stored in Stack
            Default values assigned

            Stack           Heap
            -----           ----
            c1  --------->  Car Object
                            color = null
                            speed = 0

            ✔ Each object has its own copy of data
            ✔ Methods are shared

            c1.color = "Red";
            c1.speed = 120;
            c1.drive();


            Car c1 = new Car();
            Car c2 = new Car();

            c1.speed = 100;
            c2.speed = 200;


## 2️⃣ Encapsulation (data safety & control) : 

            Encapsulation is defined as the process of wrapping data and the methods into a single unit, typically a class. It is the mechanism that binds together the code and the data. It manipulates. Another way to think about encapsulation is that it is a protective shield that prevents the data from being accessed by the code outside this shield. 
            
            
            With encapsulation ✅:

                Data protection
                Validation rules
                Maintainable code
                Controlled access

            ## Without Encapsulation : 

                class Account {
                    public double balance;   // anyone can change
                }

                Account acc = new Account();
                acc.balance = -100000;          // ❌ Allowed

            ## With Encapsulation :

                class Account {
                    private double balance;

                    public void deposit(double amount) {
                        if (amount > 0) {
                            balance += amount;
                        }
                    }

                    public double getBalance() {
                        return balance;
                    }
                }

                Account acc = new Account();
                acc.deposit(5000);
                System.out.println(acc.getBalance());

            Encapsulation is Achieved in Java

                1️⃣ Make variables private
                2️⃣ Provide public getters & setters (if needed)

                | Concept       | Meaning                            |
                | ------------- | ---------------------------------- |
                | Encapsulation | Wrapping data + methods            |
                | Data Hiding   | Restricting access using `private` |


                . Is making variables private enough for Encapsulation ?
                    ❌ No
                    ✔ You must control modification logic

                . Encapsulation = safety + control
                . Private variables are mandatory
                . Getters/setters are not compulsory
                . Strong encapsulation = fewer bugs
                . Foundation for abstraction


## 3️⃣ Inheritance : 

            Inheritance is an important pillar of OOP (Object Oriented Programming). It is the mechanism in Java by which one class is allowed to inherit the features (fields and methods) of another class. We are achieving inheritance by using extends keyword. Inheritance is also known as "is-a" relationship.

            Example: Dog, Cat, Cow can be Derived Class of Animal Base Class. 

            🔹Superclass: The class whose features are inherited is known as superclass (also known as base or parent class).

            🔹Subclass: The class that inherits the other class is known as subclass (also known as derived or extended or child class). 
                    The  subclass can add its own fields and methods in addition to the superclass fields and methods.

            🔹Reusability: Inheritance supports the concept of "reusability", i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

            // Superclass (Parent)
            class Animal {
                void eat() {
                    System.out.println("Animal is eating...");
                }

                void sleep() {
                    System.out.println("Animal is sleeping...");
                }
            }

            // Subclass (Child) - Inherits from Animal
            class Dog extends Animal {
                void bark() {
                    System.out.println("Dog is barking!");
                }
            }

            public class Main {
                public static void main(String[] args) {
                    Dog myDog = new Dog();

                    // Inherited methods (from Animal)
                    myDog.eat();    
                    myDog.sleep();  

                    // Child class method
                    myDog.bark();   
                }
            }

            🔹Why Inheritance Exists?
                Avoid code duplication
                Promote reusability
                Support polymorphism
                Create class hierarchies

            🔹 Java supports:
                Single inheritance (classes)
                Multiple inheritance via interfaces only

            🔹 Types of Inheritance in Java:

                1️⃣ Single Inheritance : 

                    class A { }
                    class B extends A { }

                2️⃣ Multilevel Inheritance : 

                    class A { }
                    class B extends A { }
                    class C extends B { }
                
                3️⃣ Hierarchical Inheritance : 

                    class A { }
                    class B extends A { }
                    class C extends A { }

                ❌ Multiple Inheritance (Classes) : 

                    class C extends A, B { } // ❌ Not allowed

                    Reason 👉 Diamond Problem

                    class A {
                        void show() { }
                    }

                    class B extends A { }
                    class C extends A { }

                    // class D extends B, C ❌
                    👉 Ambiguity: Which show() to inherit?
                    ✔ Java avoids this using interfaces

            🔹Method Overriding : 
                ✔ Same method signature
                ✔ Runtime polymorphism

                class Animal {
                    void sound() {
                        System.out.println("Animal sound");
                    }
                }

                class Dog extends Animal {
                    @Override
                    void sound() {
                        System.out.println("Bark");
                    }
                }
            
            🔹Rules of Method Overriding
            
            | Rule           | Explanation        |
            | -------------- | -----------------  |
            | Method name    | Same               |
            | Parameters     | Same               |
            | Return type    | Same / Covariant   |
            | Access level   | Cannot reduce      |
            | static method  | ❌ Cannot override |
            | final method   | ❌ Cannot override |
            | private method | ❌ Not inherited   |

            🔹 final & Inheritance

            | final usage    | Effect               |
            | -------------- | -------------------- |
            | final class    | Cannot be inherited  |
            | final method   | Cannot be overridden |
            | final variable | Constant             |

            
            🔹 private Members & Inheritance

                private members are not inherited
                But they exist in memory


            🧠 Super Keyword in Java : 

                The super keyword in Java is used to refer to the immediate parent class object in an inheritance hierarchy. It allows a subclass to explicitly access parent class members when they are hidden or overridden.

                - Used only in inheritance

                - Child and parent can have same variable names
                - Child can override methods
                - Parent constructor must be called explicitly sometimes

                super helps avoid ambiguity

                1️⃣ Access Parent Class Variable : 

                    class Vehicle {
                        int speed = 60;
                    }

                    class Car extends Vehicle {
                        int speed = 100;

                        void display() {
                            System.out.println(speed);        // Child speed
                            System.out.println(super.speed);  // Parent speed
                        }
                    }

                2️⃣ Call Parent Class Method : 

                    class Animal {
                        void sound() {
                            System.out.println("Animal sound");
                        }
                    }

                    class Dog extends Animal {
                        void sound() {
                            System.out.println("Dog barks");
                        }

                        void show() {
                            super.sound();  // Call parent method
                            sound();        // Call child method
                        }
                    }

                3️⃣ Call Parent Class Constructor:

                    ⚠ Rules:
                    - super() must be first statement
                    - If not written → compiler adds default super()
                    - Parent must have no-arg constructor, else compile error

                    class Person {
                        Person(String name) {
                            System.out.println("Person name: " + name);
                        }
                    }

                    class Student extends Person {
                        Student() {
                            super("Alex"); // Must be first line
                            System.out.println("Student constructor");
                        }
                    }


                🔹 What Happens If We Don’t Use super()?

                    class A {
                        A(int x) { }
                    }

                    class B extends A {
                        B() {
                            // super(); ❌ compiler tries this
                        }
                    }

                    ❌ Compile-time error
                    👉 Because parent has no default constructor

                🔹 super vs this

                    | Feature                 | this            | super           |
                    | ----------------------- | --------------- | --------------- |
                    | Refers to               | Current object  | Parent object   |
                    | Access variable         | Current class   | Parent class    |
                    | Call constructor        | Same class      | Parent class    |
                    | Position in constructor | First statement | First statement |

                🔹 Can super Be Used with Static Members? --> No
                🔹 Can super access private members? --> ❌ No (private members are not inherited)
                🔹 Can we call both this() and super()? --->  ❌ No   | ✔ Only one, and it must be first
                

                class Person {
                    String name;
                    int age;

                    Person() {
                        this("Unknown", 0);   // this() → calls same class constructor
                        System.out.println("Person default constructor");
                    }

                    Person(String name, int age) {
                        this.name = name;     // this → current class variable
                        this.age = age;
                        System.out.println("Person parameterized constructor");
                    }

                    void display() {
                        System.out.println("Name: " + name + ", Age: " + age);
                    }
                }

                class Employee extends Person {
                    int empId;

                    Employee() {
                        this(101);            // this() → calls same class constructor
                        System.out.println("Employee default constructor");
                    }

                    Employee(int empId) {
                        super("Alex", 30);    // super() → calls parent constructor
                        this.empId = empId;   // this → current class variable
                        System.out.println("Employee parameterized constructor");
                    }

                    void display() {
                        super.display();      // super → parent method
                        System.out.println("Employee ID: " + this.empId);
                    }
                }

                public class Test {
                    public static void main(String[] args) {
                        Employee e = new Employee();
                        e.display();
                    }
                }
                Step 1: Object Creation
                    Employee e = new Employee();
                Step 2: Constructor Call Chain
                Employee() 
                    → this(101)
                        → super("Alex", 30)
                            → Person(String, int)
                    #Output:
                    Person parameterized constructor
                    Employee parameterized constructor
                    Employee default constructor
                Step 3: Method Call
                e.display();
                    super.display() → Parent method
                    this.empId → Child variable
                    #output
                    Name: Alex, Age: 30
                    Employee ID: 101

        
## 4️⃣ Polymorphism : 

                Polymorphism = One name, many forms
                👉 Same method name behaves differently based on context.

            🔹 Types of Polymorphism in Java

                | Type         | Also Called          | Decided At   |
                | ------------ | -------------------- | ------------ |
                | Compile-time | Static Polymorphism  | Compile time |
                | Runtime      | Dynamic Polymorphism | Runtime      |


            👉 Overloading is compile-time polymorphism because the method call is resolved by the compiler based on parameters.

            👉 Overriding is runtime polymorphism because the JVM decides which method to execute based on the actual object at runtime.
            
            1️⃣ Compile-Time Polymorphism (Method Overloading) : 

                Same method name, different parameter list, in the same class.

                class Calculator {
                    int add(int a, int b) {
                        return a + b;
                    }

                    double add(double a, double b) {
                        return a + b;
                    }
                }

                🔹 Overloading Rules : 

                    | Rule                       | Allowed?  |
                    | -------------------------- | --------  |
                    | Different parameters       | ✅ Yes    |
                    | Different return type only | ❌ No     |
                    | Different access modifier  | ❌ No     |
                    | static methods             | ✅ Yes    |
                    | final methods              | ✅ Yes    |
                

            2️⃣ Runtime Polymorphism (Method Overriding)

                Child class provides specific implementation of parent method.

                class Animal {
                    void sound() {
                        System.out.println("Animal sound");
                    }
                }

                class Dog extends Animal {
                    @Override
                    void sound() {
                        System.out.println("Dog barks");
                    }
                }

                ✔ Method decided at runtime
                ✔ Based on object type, not reference type

                🔹 Overriding Rules :

                    | Rule                  | Status                             |
                    | --------------------- | ---------------------------------- |
                    | Same method signature | ✅                                 |
                    | Access level reduced  | ❌                                 |
                    | static method         | ❌ (method hiding)                 |
                    | final method          | ❌                                 |
                    | private method        | ❌                                 |
                    | Exception type        | Child can throw narrower exception |


            🔹 Polymorphism with Interfaces : 

                interface Payment {
                    void pay();
                }

                class UPI implements Payment {
                    public void pay() {
                        System.out.println("Pay using UPI");
                    }
                }

                class Card implements Payment {
                    public void pay() {
                        System.out.println("Pay using Card");
                    }
                }

            🔹Can constructor be polymorphic? ---> ❌ No (constructors are not inherited)
            🔹Can static methods be overridden? ---> ❌ No    ✔ Method hiding happens
            🔹Why method overloading is compile-time? --> Because method call is resolved using reference type
            🔹Does polymorphism work without inheritance? --> ✔ Overloading → Yes  | ✔ Overriding → 
            
            | Feature            | Overloading  | Overriding |
            | ------------------ | ------------ | ---------- |
            | Polymorphism type  | Compile-time | Runtime    |
            | Inheritance needed | ❌ No        | ✅ Yes    |
            | Binding            | Static       | Dynamic    |



## 5️⃣ Abstraction :

            Abstraction = Hiding implementation details and showing only essential features.

                Java provides two ways:
                1️⃣ Abstract Class
                2️⃣ Interface
            
            1️⃣ Abstract Class : 

                A class declared using abstract keyword.
                    ✔ Can have abstract + concrete methods
                    ✔ Can have constructors
                    ✔ Can have instance variables

                🔹 Abstract Method

                    A method without implementation.
                        ✔ Child class must implement it
                        ❌ Cannot be private / final / static   

                abstract class Vehicle {
                    abstract void start();

                    void fuel() {
                        System.out.println("Fuel filled");
                    }
                }
                
                class Car extends Vehicle {
                    void start() {
                        System.out.println("Car starts with key");
                    }
                }


                Vehicle v = new Car();
                v.start();   //Car starts with key

                🔹Rules of Abstract Class : 

                    | Rule                 | Allowed |
                    | -------------------- | ------- |
                    | Object creation      | ❌ No    |
                    | Constructor          | ✅ Yes   |
                    | Final methods        | ✅ Yes   |
                    | Static methods       | ✅ Yes   |
                    | Multiple inheritance | ❌ No    |

            2️⃣ Interface (Pure Abstraction):
                A contract that a class agrees to follow.

                interface Payment {
                    void pay();
                }

                ✔ 100% abstraction (before Java 8)
                ✔ Supports multiple inheritance

                class UPI implements Payment {
                    public void pay() {
                        System.out.println("Pay using UPI");
                    }
                }

                🔹 Interface Rules : 

                    | Feature              | Interface                   |
                    | -------------------- | --------------------------- |
                    | Variables            | `public static final`       |
                    | Methods              | `public abstract` (default) |
                    | Constructor          | ❌ No                        |
                    | Object creation      | ❌ No                        |
                    | Multiple inheritance | ✅ Yes                       |

                🔹 Java 8+ Interface : 

                    interface Bank {
                        default void msg() {
                            System.out.println("Welcome");
                        }

                        static void info() {
                            System.out.println("Bank Info");
                        }
                    }


                🔹 Abstract Class vs Interface : 

                    | Feature              | Abstract Class      | Interface                  |
                    | -------------------- | ------------------- | -------------------------- |
                    | Keyword              | `abstract`          | `interface`                |
                    | Methods              | Abstract + concrete | Abstract (default allowed) |
                    | Variables            | Any type            | public static final        |
                    | Constructors         | ✅ Yes               | ❌ No                       |
                    | Multiple inheritance | ❌ No                | ✅ Yes                      |
                    | Use when             | IS-A + code reuse   | Capability / contract      |

                🔹 When to Use What?

                    ✔ Use abstract class when:
                        Classes are closely related
                        You want to share code

                    ✔ Use interface when:
                        Multiple inheritance needed
                        You want loose coupling
                        You define capability (Payable, Runnable)

                🔹Can abstract class have main method? ---> ✅ Yes
                🔹Can abstract class implement interface? ---> ✅ Yes
                🔹Can interface extend another interface? --> ✅ Yes (multiple)
                🔹Can we have constructor in interface? ---> ❌ No
                🔹Interface variables are always: public static final
                🔹Interface ❌ No constructor & ❌ No object creation logic
                🔹Can interface extend abstract class? ---> ❌ No
                🔹Can abstract class have no abstract methods? ---> ✅ Yes

                abstract class Vehicle {
                    abstract void move();
                }

                interface Electric {
                    void charge();
                }

                class Tesla extends Vehicle implements Electric {
                    void move() {
                        System.out.println("Driving");
                    }

                    public void charge() {
                        System.out.println("Charging");
                    }
                }

## SOLID Principles :
    is pure OOPS mindset + real-world design maturity.

        S → Single Responsibility
        O → Open / Closed
        L → Liskov Substitution
        I → Interface Segregation
        D → Dependency Inversion
