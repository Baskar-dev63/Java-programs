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




class prime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Starting Number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the end of range: ");
        int b = scanner.nextInt();

        if (a == 1) {
            System.out.println(a + " is Not a Prime Number.");
            a = 2;
        }

        int count = 0;
        for (int i = a; i <= b; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                count += 1;
                System.out.println(i + " is " + count + " Prime Number..");
            }
            
        }
        
    }
}

