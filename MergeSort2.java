import java.util.*;
import java.util.Scanner;
public class MergeSort2 {
    public void sort(int arr[],int l,int r){
        if(l<r){
            int mid = ((l+r)/2);
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public void merge(int arr[], int mid, int l, int r){
        int i = l;
        int j = mid+1;
        int k = 0;
        int c[] = new int[r-l+1];
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                c[k] = arr[i];
                i++;
                k++;
            }
            else{
                c[k] = arr[j];
                j++;
                k++;
            }

        }
        while(i<=mid){
            c[k] = arr[i];
            i++;
            k++;
        }
        while(j<=r){
            c[k] = arr[j];
            j++;
            k++;
        }

        
        for(int x=0;x<c.length;x++){
            arr[l+x] = c[x];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array's elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        MergeSort ms = new MergeSort();
        ms.sort(arr,0,n-1);
        System.out.println("Sorted array's elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
 }

