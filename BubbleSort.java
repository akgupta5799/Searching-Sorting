import java.util.*;
import java.util.Scanner;
public class BubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<n-1;j++)//Number of passes=n-1; We will not include n-1 because indexing is start from 0
        {
            for(int k=0;k<n-1-j;k++){
                if(arr[k]>arr[k+1]){
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        System.out.println("Sorted array's elements are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}