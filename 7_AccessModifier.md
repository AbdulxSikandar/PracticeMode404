# Access Modifier : 
Access modifiers control the visibility (scope) of:
        classes
        variables
        methods
        constructors
    They help enforce encapsulation and security in Java.

    Use of Access Modifiers : 
        ✔ Data hiding
        ✔ Controlled access
        ✔ Security
        ✔ Loose coupling
        ✔ Clean API design
    Without access modifiers, anyone can access everything, which is unsafe.

    Types of Access Modifiers in Java

    Java has 4 access modifiers:

        public
        protected
        default (package-private)
        private

    1. public :
        Accessible from anywhere.

        public class Test {
            public int x = 10;

            public void show() {
                System.out.println(x);
            }
        }


    2. Protected :
        Accessible:
            same package
            subclass (even in different package)

            class Parent {
                protected int x = 10;
            }

            class Child extends Parent {
                void display() {
                    System.out.println(x);
                }
            }


    3. default ( package-private) :
        Accessible only within the same package.
        ❌ Not accessible outside package

        class Demo {
            int x = 5; // default access
        }


    4. private :
        Accessible only inside the same class.
        ✔ Used for data hiding
        ✔ Access via getters/setters

        class Account {
            private double balance = 1000;

            public double getBalance() {
                return balance;
            }
        }

    Scenario 1: Can we override a method with weaker access? ---> No
        ✔ Access level must be same or higher

        class A {
            protected void show() {}
        }

        class B extends A {
            void show() {} // ❌ default is weaker than protected
        }

    Scenario 2: Can constructor be private ? --> Yes
        class Singleton {
            private Singleton() {}
        }

    Scenario 3: Default vs Protected (Very Confusing)
        default → same package only
        protected → same package + subclass outside package

    Scenario 4: Can private methods be overridden? --> No

    Scenario 5: Access modifier in interface ---> ✔ All interface members are public by default

    - Most restrictive → private
    - Least restrictive → public
    - protected is mainly used for inheritance
    - Top-level classes cannot be private or protected
    - You cannot reduce access level while overriding