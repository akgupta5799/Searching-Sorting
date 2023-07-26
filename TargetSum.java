/*Describe an Θ(n logn) time algorithm that, given a set S of n integers and another integer, determine whether or not there exists two elements in S whose sum is exactly x? */

import java.util.Collections;
import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        Arrays.sort(arr);

        int left = 0;
        int right = n-1;
        while(left < right){
            if(arr[left] + arr[right] == target){
                System.out.println(true);
                return;
            }else if(arr[left] + arr[right] > target){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println(false);
    }
}
