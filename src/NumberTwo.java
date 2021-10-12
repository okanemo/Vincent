import java.util.ArrayList;
import java.util.Scanner;

public class NumberTwo{
    public static int removeDuplicate(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }  
        int j = 0;
        for (int i=0; i < n-1; i++){
        	 
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
      
        arr[j++] = arr[n-1];
        
     
        return j;
    }
     
    public static void main (String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Input numbers : ");
        String numbers = scan.nextLine();
        String[] arr = numbers.split(" ");
        int size = arr.length;
        int[] numArr = new int[size];
        
        for(int i = 0 ; i < size ; i++) {
        	numArr[i] = Integer.parseInt(arr[i]);
        }
    	int numLength;
        numLength = removeDuplicate(numArr, size);
        
        
        for (int i=0; i<numLength; i++)
        System.out.print(arr[i]+" ");
        	
    }
}
