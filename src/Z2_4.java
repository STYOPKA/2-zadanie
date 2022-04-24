public class Z2_4 {
    static double eps = 0.000000001;
    public static double f(double x) {
        return (Math.pow(x, 3) - 1.5 * Math.pow(x, 2) - 2.5 * x + 3);
    }
    public static double df(double x) {
        return (3 * Math.pow(x, 2) - 3 * x - 2.5);
    }
    static void newton(double x0) {
        double x1 = x0 - f(x0) / df(x0);
        if (Math.abs(x1 - x0) > eps) {
            newton(x1);
        }
        else System.out.println(x1 + " ");
    }
    static void div2(double a, double b) {
        double x = (a + b) / 2;
        if (Math.abs(b - a) > eps) {
            if (f(a) * f(x) > 0) {
                a = x;
            } else {
                b = x;
            }
            div2(a, b);
        }
        else System.out.println(x + " ");
    }

    public static void main(String[] args) {
        System.out.println("Newton method: ");
        System.out.print("x1 = ");
        newton(-100);
        System.out.print("x2 = ");
        newton(0);
        System.out.print("x3 = ");
        newton(100);
        System.out.println("Bisection method: ");
        System.out.print("x1 = ");
        div2(-50, 0);
        System.out.print("x2 = ");
        div2(0, 2);
        System.out.print("x3 = ");
        div2(2, 50);
    }
}
