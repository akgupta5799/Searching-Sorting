public class Palindrome {
    
    public static void main(String[] args) {
        
        String s = "143";
        int l=0;
        int h=s.length()-1;
        int count=0;
        while(l<=h)
        {
            char c1 = s.charAt(l);
            char c2 = s.charAt(h);
            if(c1 == c2)
            {
                l++;
                h--;
                count++;
            }
            break;
        }
        if(count==0)
         System.out.println("Given string isn't a palindrome.");
        else{
            System.out.println("Given string is Palindrome.");
        }
    }
}
