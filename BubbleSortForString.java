import java.util.*;
public class BubbleSortForString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of String array: " );
        int n = sc.nextInt();
        String s[] = new String[n];
        System.out.println("Enter the Strings: ");
        for(int i=0; i<s.length;i++){
            s[i] = sc.next();
        }

        System.out.println("Entered String elements are: ");
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }

        System.out.println();

        String temp;

        // Bubble Sort Algorithm

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(s[j].compareTo(s[j+1])>0){
                    temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted String elements are: ");
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }

    }
    
}
