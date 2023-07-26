import java.util.*;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search element: ");
        int val = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==val){
                System.out.println("Element is found at index "+i);
                return;
            }

        }
        System.out.println("Element is not found");


    }
}