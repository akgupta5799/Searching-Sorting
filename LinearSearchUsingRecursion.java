import java.util.*;
public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search element: ");
        int item = sc.nextInt();
        int start = 0;
        int x = linear_search(arr,size,item,start);

        if(x>0){
         System.out.println("Element is found at index "+x);
        }
         else{
            System.out.println("Element is not found.");
         }

    }
    public static int linear_search(int arr[], int size, int item,int start){
        if(start>=size){
            return -1;
        }
        if(arr[start]==item){
            return start;
        }
        
        return linear_search(arr,size,item,start+1);

    }
}
