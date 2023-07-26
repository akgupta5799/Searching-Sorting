import java.util.*;
import java.util.Scanner;
public class MergeSort{

       // Function to merge the subarrays of arr[]
    //    merge (int arr[], int start, int n1, int n2)
    public void merge(int arr[], int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        // temporary subarrays
        
        int leftarray[] = new int[n1];
        int rightarray[] = new int[n2];

        // copying data into the temporary subarrays
        
        for(int i=0;i<n1;i++){
            leftarray[i] = arr[l+i];
        }

        for(int j=0;j<n2;j++){
            rightarray[j] = arr[mid+1+j];
        }
        // C[n1 + n2]
        int i=0,j=0,k=l; // i = start; j = start + n1; leftSize = start + n1; rightSize = start + n1 + n2; k = 0;
        while(i<n1 && j<n2){ 
            if(leftarray[i]<=rightarray[j]){
                arr[k] = leftarray[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightarray[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k] = leftarray[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rightarray[j];
            j++;
            k++;
        }

        // for i = 0 to n1 + n2
        //    arr[start + i] = C[i];
    }

    public void sort(int arr[],int l,int r){
        if(l<r){
            int mid = ((l+r)/2);
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
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