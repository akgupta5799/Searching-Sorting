import java.util.*;
public class Words{
    public static void main(String[] args) {
        
        String s = "My name Is Prins Kumar Sharma. I'm from darbhanga Bihar.";
        
        int count = 0;
        for(int i=0; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            System.out.print(c+" ");
            if (c ==' ')
            {
                count++;
            }
        }
        
        System.out.println("no. of words = "+(count+1));
    }
}
