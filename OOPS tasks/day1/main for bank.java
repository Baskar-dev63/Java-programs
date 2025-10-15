import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank cus = new Bank();

        cus.setaccnumber(234435);
        System.out.println("This is Account number: " + cus.getaccnumber());
        System.out.println("Enter your deposit amount: ");
        double depo = scanner.nextDouble();
        cus.setdeposit(depo);
        System.out.println("Your given deposit amount: " + cus.getdeposit());
        System.out.println("your balance: " + cus.getbalance());
        System.out.println("Are you want to withdraw amount from you account:(yes/no)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter your withdrawal Amount.");
            double rupees = scanner.nextDouble();
            cus.setwithdraw(rupees);
        }
    }
}
