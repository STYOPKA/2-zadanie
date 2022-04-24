import java.util.Scanner;

public class Z2_3 {
    static int [] arr;
    static Scanner sc;
    public static void fillArr(int i) {
        if (i==0) return;
        else fillArr(i-1);
        System.out.print("arr[" + (i-1) + "] = ");
        arr[i-1] = sc.nextInt();
    }
    public static void printArr(int i) {
        if (i==0) return;
        else printArr(i-1);
        System.out.print( arr[i-1] + " ");
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Input array: ");
        fillArr(size);
        System.out.println("Array: ");
        printArr(size);
    }
}

