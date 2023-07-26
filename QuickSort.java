
import java.util.*;
class QuickSort
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low < high) {
            int partiIndex = partition(arr, low, high);
            quickSort(arr, low, partiIndex - 1);
            quickSort(arr, partiIndex + 1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1, j;
        for(j = low; j < high; j ++) {
            if(arr[j] <= pivot) {
                i ++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i ++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        return i;
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
        QuickSort ms = new QuickSort();
        ms.quickSort(arr,0,n-1);
        System.out.println("Sorted array's elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
