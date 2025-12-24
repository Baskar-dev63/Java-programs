import java.util.Scanner;

public class main {
    public static String numberFinder(int a) {
        if (a > 0) {
            if (a % 2 == 0)
                return "Positive Even Number";
            else
                return "Positive Add Number";
        } else if (a < 0)
            return "Negaitve Number";
        else
            return "Number is Zero";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a Number:");
                int a = scanner.nextInt();
                System.out.println(numberFinder(a));
                break;
            } catch (Exception err) {
                System.out.println("Your Not given a Proper Value");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
