import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a != 0 && b != 0) {
            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
            }
            System.out.println("GCD of value of: " + a);
        } else {
            System.out.println("Give a proper values to find.");
        }
    }
}
