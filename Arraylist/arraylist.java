
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter a length to the elements in Array:");
        int length = scanner.nextInt();
        System.out.println("Enter the numbers to set values of Array.");

        for (int i = 0; i < length; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }
        System.out.println("Printing the values:");

        for (int i = 0; i < length; i++) {
            System.out.println("values: " + list.get(i));
        }

    }
}


class divisible {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter a length to the elements in Array:");
        int length = scanner.nextInt();
        System.out.println("Enter the numbers to set values of Array.");

        for (int i = 0; i < length; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }
        System.out.println("Printing the values:");

        for (int i = 0; i < length; i++) {
            System.out.println("values: " + list.get(i));
        }

        for (int i = 0; i < length; i++) {
            if (list.get(i) % 5 == 0 || list.get(i) % 7 == 0) {
                if (list.get(i) % 5 == 0) {
                    System.out.println("This is value that divised by 5 : " + list.get(i));
                } else {
                    System.out.println("This is value that divised by 7: " + list.get(i));
                }
            }
        }

    }
}

class repeatvalues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter a length to the elements in Array:");
        int length = scanner.nextInt();
        System.out.println("Enter the numbers to set values of Array.");

        for (int i = 0; i < length; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }
        int check = list.get(0);

        for (int i = 1; i < length; i++) {
            if (check == list.get(i)) {
                System.out.println("Repeated values: " + list.get(i));
            }
            check = list.get(i);
        }

    }
}
