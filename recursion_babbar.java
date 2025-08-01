public class recursion_babbar {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    public static int sumOfN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfN(n - 1);

    }

    public static int powerOfN(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        int power = base * powerOfN(base, exp - 1);
        return power;
    }

    public static void printNum(int n) {
        if (n == 0) {
            // System.out.println(0);
            return;
        }
        printNum(n - 1);
        System.out.print(n + " ");
        // printNum(n-1);
    }

    public static void fobonnacci(int a, int b, int num) {

        if (num == 10) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fobonnacci(b, c, num + 1);

    }

    public static int fobannacci2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        // int sum=(n-1)+(n-2);
        int sum = fobannacci2(n - 1) + fobannacci2(n - 2);

        return sum;
    }

    public static void sayNumber(int n) {
        if (n == 0) {
            return;
        }
        String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "sever", "eight", "nine" };
        int temp = n % 10;
        n /= 10;
        sayNumber(n);
        System.out.print(arr[temp] + " ");

    }

    public static boolean arraySort_binarySearch(int[] arr, int size) {
        if (size == 0 || size == 1) {
            return true;
        }
        if (arr[size - 1] < arr[size - 2]) {
            return false;
        }

        else {
            // boolean ans = arraySort(arr, size - 1);
            return arraySort_binarySearch(arr, size - 1);
        }
    }

    public static int sumArray(int[] arr, int size) {
        if (size == 0) {
            return 0;
        }
        return arr[size - 1] + sumArray(arr, size - 1);
    }

    static void printArray(int arr[], int size) {
        System.out.println("size of the array is " + size);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean linearSearch(int[] arr, int size, int key) {
        printArray(arr, size);
        if (size == 0) {
            return false;
        }
        if (arr[size - 1] == key) {
            return true;
        }
        return linearSearch(arr, size - 1, key);

    }

    static void printBin(int[] arr, int s, int e) {
        System.out.println(s);
        System.out.println(e);
        for (int i = s; i < e; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean binarySearch(int[] arr, int s, int e, int key) {
        printBin(arr, s, e);
        if (s > e) {
            return false;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == key) {
            return true;
        }

        if (arr[mid] < key) {
            return binarySearch(arr, mid + 1, e, key);
        } else {
            return binarySearch(arr, s, mid - 1, key);
        }
    }

    public static void main(String[] args) {
        // System.out.println(factorial(5));
        // System.out.println(sumOfN(10 ));
        // System.out.println(powerOfN(2, 5));///
        // printNum(5);
        // System.out.print("0 1 ");
        // fobonnacci(0, 1, 1);
        // System.out.println(fobannacci2(10));
        // sayNumber(5368125);
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // System.out.println(arraySort_binarySearch(arr, arr.length));
        // System.out.println(sumArray(arr, arr.length));
        // System.out.println(linearSearch(arr, arr.length, 4));
        // System.out.println(binarySearch(arr, 0, arr.length - 1, 2));

    }
}
