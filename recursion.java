public class recursion {

    public static void printNum(int n) {
        if (n > 5)
            return;
        System.out.print(n + " ");
        printNum(n + 1);
    }

    public static void sumOfn(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }

        sum = sum + i;
        sumOfn(i + 1, n, sum);
        // return sum;
    }

    // find the factorial by recursion method
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = factorial(n - 1);
        int fact = fact_nm1 * n;
        return fact;
    }

    public static void fabonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");

        fabonacci(b, c, n - 1);
        // System.out.println(i);
    }

    public static void powerOfnumber(int b, int e, int i, int pow) {
        if (i == e) {
            pow = pow * b;
            System.out.println(pow);
            return;
        }
        pow = pow * b;

        powerOfnumber(b, e, i + 1, pow);
    }

    public static int powerofnum(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xnm1 = powerofnum( x,n - 1);
        int pow = x * xnm1;
        return pow;

    }
    public static void Reverse(String str, int index){
        if(index==0) {
            System.out.println(str.charAt(index));
            return;
        }
            System.out.print(str.charAt(index));
            Reverse(str, index-1);
        
    }
    public static int start = -1;
    public static int end=-1;
public static void occurence(String str ,int index,char pickElement){
    if(index == str.length()){
        System.out.println(start);
        System.out.println(end);
        return; 
    }
    char cC=str.charAt(index);
    if(cC==pickElement){
        if(start==-1) start=index;
          else end=index;
    }
    occurence(str, index+1,pickElement);
} 
public static boolean  checkSort(int[] arr, int index){
    if(index==arr.length-1){
         return true;
    }
     if(arr[index]>=arr[index+1]){
        return checkSort(arr, index+1);
     }
     else 
     return false;
     
}
    public static void main(String[] args) {
      int arr[]={5,4,4,3,1,1};
        // printNum(0);
        // sumOfn(1, 5,0);
        // System.out.println(factorial(5));
        // fabonacci(0,1,10);
        // powerOfnumber(7, 3, 1, 1);
        // System.out.println(powerofnum(2 , 5));
        String str="bacdaargar";
        // Reverse(str, str.length()-1);
    //   occurence(str, 0,'a');
    //    System.out.println(checkSort(arr, 0)); 
       String s1="vicky";
       String s2="vicky";
       System.out.println(s2);
    }
}
