import java.util.*;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int i,min;
        for(i=0;i<n-1;i++){
            min = i;
        

        for(int j=i+1;j<n;j++){
            if(arr[j] < arr[min]){
                min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    System.out.println("Sorted array's elements are: ");
    for(i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}
