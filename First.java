import java.util.Scanner;

public class First {

    // outomorphic number
    public static boolean outomorphic(int num) {
        int sqr = num * num;
        while (num > 10) {
            if (sqr % 10 != num % 10) {
                return false;
            } else {

                sqr = sqr / 10;
                num = num / 10;
            }
        }
        return true;
    }

    // factorial number
    public static int factorial(int fnum) {
        int fact = 1;
        while (fnum > 0) {
            fact = fact * fnum;
            fnum--;
        }
        return fact;
    }

    public static void peterson(int num1, int num2) {

        for (int i = num1; i <= num2; i++) {
            int n = i;
            int sum = 0;
            while (n > 0) {
                int temp = n % 10;
                sum = sum + factorial(temp);
                n = n / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    // sunny number
    public static void sunny(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            int k = i;
            double sqr = Math.sqrt(k + 1);
            if (sqr - Math.floor(sqr) == 0) {
                System.out.println(i + ",");
            }
        }
    }

    // find the tech number
    public static void technumber(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            int count = 0;
            int a = i;
            int b = i;
            while (b > 0) {
                // int temp = b % 10;
                count++;
                b /= 10;
            }
            if (count % 2 != 0) {
                // System.out.println("sorry this number has odd digit");

                continue;
            }
            // else {
            int t = count / 2;
            int n1 = (int) (a / (Math.pow(10, t)));
            // System.out.println(n1);

            int n2 = (int) (a % (Math.pow(10, t)));
            // System.out.println(n2);

            double sum = n1 + n2;
            // System.out.println(sum);

            if (Math.pow(sum, 2) == i) {
                System.out.print(i + ",");
            }
        }
    }

    // fasicinating number check
    public static void fasicinating(int num) {
        int n2 = num * 2;
        int n3 = num * 3;
        String concatstr = num + "" + n2 + "" + n3;
        boolean found = true;
        for (char c = '1'; c <= '9'; c++) {
            int count = 0;
            for (int i = 0; i < concatstr.length(); i++) {
                char ch = concatstr.charAt(i);
                if (ch == c)
                    count++;

                if (count > 1 || count == 0) {
                    found = false;
                    break;
                }
            }
        }
            if (found)
                System.out.println(num + " is a fascination number.");

            else
                System.out.println(num + " is not a fascination number");

        
    }

    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        // int t = sc.nextInt();
        // System.out.println(outomorphic(v));
        // peterson(v,t);
        // sunny(v, t);
        // technumber(v, t);
        // System.out.println(fasicinating(v));
        fasicinating(v);
    }
}