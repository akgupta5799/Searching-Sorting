import java.util.*;
import java.lang.Math;
public class BinarySearchUsingRecursion {
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
        int x = binary_search(arr,size,item,l,r);
        if(x>0){
            System.out.println("Element is found at index "+x);
        }
        else{
            System.out.println("Element is not found.");
        }
    }
     public static int binary_search( int arr[],int size, int item, int l,int r){
        if(l==r){
            if(item == arr[l]){
                return l;
            }
            else{
                return -1;
            }
        }
        if(l<r){
            int mid = (int)(Math.floor((l+r)/2));
            if(item == arr[mid]){
                return mid;
            }
            else{
                if(item < arr[mid]){
                    return binary_search(arr, size, item, l, mid-1);
                }
                else{
                    return binary_search(arr, size, item, mid+1, r);
                }
            }
        }
        return -1;
        }

     }

