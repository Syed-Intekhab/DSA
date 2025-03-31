import java.util.*;

public class Main{
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String args[]){
        int arr[] = {7, 8, 3, 2, 1};
        
        // Selection Sort
        for(int i = 0; i < arr.length; i++){
            int smallet = i;
            
            for(int j = i + 1; j < arr.length; j++){
                if(arr[smallet] > arr[j]){
                    smallet = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[smallet];
            arr[smallet] = temp;
        }
        
        printArray(arr);
    }
}
