// parent or base class  
class A {  
    void foo() {  
        System.out.println("Inside the foo method of base class.");    
    }  
}  
  
// child or derived class  
class B extends A {  
    void foo() {  
        System.out.println("Inside the foo method of derived class.");    
    }  
}  
  
public class CouplingExample {  
// main method   
    public static void main(String argvs[]) {  
        // creating an object of class B  
        B obj = new B();  
        obj.foo();  
    }  
}  

// output: Inside the foo method of derived class.

/*
Explanation: The code is simple to comprehend. There are two classes in the program. One is the base class, and another is the derived class. The derived class is being instantiated in the main method, and its foo method is invoked.

However, there is a problem in the above code. The inheritance has led to the tight coupling of classes A and B. Class B knows a lot of stuff about class A. Also, there are fair chances that changes in class A might impact class B. Let's modify the above code to understand it.

Suppose, there is a requirement to add a parameterized constructor containing two integer arguments in the base class. To incorporate the requirement, we have added a constructor in the base class.
*/