import java.util.*;

public class Main{
    static int sum;
    
    public static void printSum(int i, int n){
        sum += i;
        if(n == i){
            System.out.println(sum);
            return;
        }
        printSum(i + 1, n);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printSum(1, n);
    }
}
