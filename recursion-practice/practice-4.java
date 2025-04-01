//Factorial of n number using recursion.
import java.util.*;

public class Main{
    public static int printFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        
        int nm1 = printFactorial(n - 1);
        int factorial = nm1 * n;
        return factorial;
    }
    
    public static void main(String args[]){
        System.out.println(printFactorial(3));
    }
}
