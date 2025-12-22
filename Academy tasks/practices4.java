import java.util.Scanner;

public class main {
    public static String numberFinder(int a) {
        if (a > 0) {
            return "Positive Number";
        } else if (a < 0) {
            return "Negaitve Number";
        } else {
            return "Number is Zero";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter a Number:");
            int a = scanner.nextInt();
            System.out.println(numberFinder(a));
        }catch(Exception err){
            System.out.println("Numbers Only Acceptable.");
        }
    }
}
