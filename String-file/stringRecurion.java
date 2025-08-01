

public class stringRecurion {
    public static String reverseString(char[] str, int s, int e) {
        // System.out.println(str);
        char temp;
        if (s > e) {
            return new String(str);
        }
        temp = str[s];
        str[s] = str[e];
        str[e] = temp;
        // s++;
        // e--;

        return reverseString(str, s + 1, e - 1);
    }

    public static boolean checkpalindrome(char[] str, int s, int e) {
        if (s >= e) {
            return true;
        }
        if (str[s] != str[e]) {
            return false;
        } else
            return checkpalindrome(str, s + 1, e - 1);
    }

    public static int powerRec( int a, int b) {
        // System.out.println(".");
        if (b == 0) {
            return 1;
        }
        if(b==1){
            return a;
        }
        int res=powerRec(a, b/2);
        if(b%2==0){
            return res*res;
        }
        else return a*res*res;
        // System.out.println(",");
        
    }

    public static void main(String[] args) {
        String name = "viciv";
        char[] charname = name.toCharArray();
        // System.out.println(charname);
        // String rev = reverseString(charname, 0, charname.length - 1);
        // System.out.println(charname);
        // System.out.println(rev);

        // boolean ispalindrome = checkpalindrome(charname, 0, name.length() - 1);
        // if (ispalindrome) {
        // System.out.println("yes");
        // } else
        // System.out.println("no");

        System.out.println(powerRec( 5, 5));
    }
}