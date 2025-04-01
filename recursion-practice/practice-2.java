import java.util.*;

public class Main{
    public static void printNumbers(int num){
        if(num == 6) return;
        System.out.print(num);
        printNumbers(num + 1);
    }
    
    public static void main(String args[]){
        printNumbers(1);
    }
}
