import java.util.*;

public class arrayfile {
    // copy the element of the first array into second array
    public static void copyarray(int[] arr) {
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int j : arr2) {
            System.out.print(j + ",");
        }
    }

    // find the occurence of the number in array
    public static void occurence(int[] arr) {
        int newarr[] = new int[arr.length];
        int visit = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    newarr[j] = visit;
                }
            }
            if (newarr[i] != visit) {
                newarr[i] = count;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (newarr[i] != visit) {
                System.out.println("   " + arr[i] + "     " + newarr[i]);
            }
        }
       
    }
    // Left shifting the array by the given number;

    public static void Leftshift() {

        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int n = 2;
        for (int i = 1; i <= n; i++) {
            int j;
            int first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {

                arr[j] = arr[j + 1];
            }
            arr[j] = first;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // right shifting the array by the given number ;
    public static void Rightshift() {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int n = 3;
        for (int i = 1; i <= n; i++) {

            int last = arr[arr.length - 1];
            int j;

            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = last;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reversearray(int[] arr) {
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - 1 - i];

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr1[j] + " ");
        }
    }

    public static boolean sortArray(int[] arr) {
        boolean acc = true;
        boolean dec = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                acc = false;
            } else if (arr[i] > arr[i - 1]) {
                dec = false;
            }
        }
        return acc || dec;
    }

    public static void oddposition(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i - 1] + " ");
            }
        }
        System.out.println();
    }

    public static void evenposition(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i - 1] + " ");
            }
        }
    }
    public static int largestelement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallestelement(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void bubblesort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
     * public static void selectionsort(int[] arr){
     * int smallest;
     * for (int i = 0; i < arr.length-1; i++) {
     * smallest=i;
     * for (int j = i+1; j < arr.length; j++) {
     * if (arr[smallest] > arr[j]) {
     * smallest= j;
     * }
     * int temp=arr[i];
     * arr[i]= arr[smallest];
     * arr[smallest] =temp;
     * 
     * }
     * }
     * for (int i = 0; i < arr.length; i++) {
     * System.out.print(arr[i] + " ");
     * }
     * }
     */
    public static int sumOfarray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr1[]=new int[5];
        int arr1[] = { 1,2,2,1,1};
        // int[] arr;
        // int arr[];
        // int []arr;
        // copyarray(arr1);
        occurence(arr1);
        // Leftshift();
        // Rightshift();
        // reversearray(arr1);
        // System.out.println(sortArray(arr1));
        // oddposition(arr1);
        // evenposition(arr1);
        // System.out.println(largestelement(arr1));
        // System.out.println(smallestelement(arr1));
        // System.out.println(sumOfarray(arr1));

        // bubblesort(arr1);
        // selectionsort(arr1);

    }
}