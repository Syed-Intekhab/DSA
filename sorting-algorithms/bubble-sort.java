import java.util.*;

public class Main{
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String args[]){
        int nums[] = {2, 5, 3, 1, 4};
        
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        
        printArray(nums);
    }
}
