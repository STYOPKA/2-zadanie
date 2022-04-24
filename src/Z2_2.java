import java.util.Scanner;

public class Z2_2 {
    public static void convert(int num) {
        if (num>0) {
            convert(num/2);
            System.out.print(num%2);
        }
    }

    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        input = sc.nextInt();
        convert(input);
    }
}