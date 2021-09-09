import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if(b>a) {
            if(b<c) return b;
            return a;
        }
    return c;
    }

    public static int magnitude(int a, int b) {
        if(Math.abs(a) > Math.abs(b)) return a;
        return b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(a*a+b*b);
    }


    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("median, magnitude, or pythagoras?");
        if(scan.next().equalsIgnoreCase("median")) {
            System.out.println("give first number");
            int a = scan.nextInt();
            System.out.println("give second number");
            int b = scan.nextInt();
            System.out.println("give third number");
            int c = scan.nextInt();
            System.out.println(median(a, b, c));
        }
        if(scan.next().equalsIgnoreCase("magnitude")) {
            System.out.println("give first number");
            int a = scan.nextInt();
            System.out.println("give second number");
            int b = scan.nextInt();
            System.out.println(magnitude(a, b));
        }
        if(scan.next().equalsIgnoreCase("pythagoras")) {
            System.out.println("give first number");
            int a = scan.nextInt();
            System.out.println("give second number");
            int b = scan.nextInt();
            System.out.println(pythagoras(a, b));
        }
    }
}
