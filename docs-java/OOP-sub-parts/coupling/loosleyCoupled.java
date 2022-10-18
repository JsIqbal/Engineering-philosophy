interface Parent {  
    void foo();  
}  
  
class A implements Parent {  
    // parameterized constructor  
    A(int x, int y) {  
          
    }  
      
    public void foo() {  
        System.out.println("In the foo method of class A.");  
    }  
}  
  
class B implements Parent {  
    public void foo() {  
        System.out.println("In the foo method of class B.");  
    }  
}  
  
public class CouplingExample2 {  
// main method   
    public static void main(String argvs[]) {  
        // creating an object of class B  
        B obj = new B();  
        obj.foo();  
    }  
} 

// Output:  In the foo method of class B.

/*
Explanation: Now, the parameterized constructor of class A is not affecting class B. It is because class A and class B both are dependent on the abstraction, which is the interface of this case. Note that not only the parameterized constructor, if any other changes are made in class A, then it will also not affect class B, and vice-versa is also true.

In the above code, class A and class B are loosely coupled as they are not directly dependent on each other. Also, whatever changes we make in class A are not visible to class B.
*/