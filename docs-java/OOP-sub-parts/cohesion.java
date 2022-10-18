class ArithmeticOperation {  
    // method for adding two numbers  
    public void addition(int a, int b) {  
        int sum = a + b;  
        System.out.println("Addition of the numbers " + a + " and " + b + " is: " + sum);  
    }      
}  
class CharacterOperation {  
// method for checking the vowels and consonants  
    public void findingVowel(char a) {  
        switch(a) {  
            case 'a':  
            case 'e':  
            case 'i':  
            case 'o':  
            case 'u':  
                System.out.println(a + " is a vowel.");  
            break;  
            default:  
            System.out.println(a + " is not a vowel.");  
        }  
    }      
}  
// main class  
public class CohesiveExample1 {  
// main method  
    public static void main(String argvs[]) {  
        int a = 9;  
        int b = 46;  
        char c = 't';  
        char d = 'o';  
        // creating an object of the class ArithmeticOperation  
        ArithmeticOperation obj = new ArithmeticOperation();  
        // creating an object of the class CharacterOperation  
        CharacterOperation obj1 = new CharacterOperation();  
        obj.addition(a, b);  
        obj1.findingVowel(c);  
        obj1.findingVowel(d);  
    }  
}  

/*
Explanation: The above code provides two separate classes: one for doing the addition operation and another for doing the character operation. It is done because character and addition operations are not related to each other. Thus, cohesiveness in the above program is maintained.
*/