import java.util.*;
import java.lang.Math;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search element: ");
        int item = sc.nextInt();
        int l=0,r=size-1;
        while(l<=r){
            int mid = (int) Math.floor((l+r)/2);
            if(item == arr[mid]){
                System.out.println("Element is found at index "+mid);
                return;
            }
            if(item < arr[mid]){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        System.out.println("Element is not found.");
    }
    
}
