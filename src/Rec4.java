public class Rec4 {
    public static int fact(int n){
        int result;
        if (n==1)
            return 1;
        else{
            result=fact(n-1)*n;
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.print("5! = "+fact(5));
    }
}