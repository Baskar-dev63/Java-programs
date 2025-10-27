import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (num == 1) {
            System.out.println(num + " is not a Prime Number.");
        } else if (isPrime) {
            System.out.println(num + " is Prime Number.");
        } else {
            System.out.println(num + " is Not a Prime Number.");
        }

    }
}
