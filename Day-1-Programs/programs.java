
import java.util.Scanner;

public class programs {

    public static void main(String[] args) {
//        Reverse printing numbers.

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }
}

class sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Sum of All Natural Numbers:
        System.out.println("Enter the range of natural numbers to add: ");
        int sum = scanner.nextInt();
        int add = 0;

        for (int i = 1; i <= sum; i++) {
            add += i;
        }

        System.out.println("This is Addition of Natural Numbers():" + add);

    }
}

class string {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String reverse Methods in java:
        //Using StringBuilder method:
        System.out.println("Enter Your Name:");
        String name = scanner.next();
        StringBuilder stringname = new StringBuilder(name);
        String reversename = stringname.reverse().toString();
        System.out.println(name);
        System.out.println(reversename);

        //Using StringBuffer Method:
        StringBuffer strname = new StringBuffer(name);
        String revname = strname.reverse().toString();
        System.out.println(revname);

    }
}

class reverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Looping reverse method:
        System.out.println("Enter a word:");
        String character = scanner.next();
        String reversedstring = "";
        for (int i = 0; i < character.length(); i++) {
            reversedstring = character.charAt(i) + reversedstring;
        }
        System.out.println(reversedstring);

        //Palindrome check:
        if (character.equals(reversedstring)) {
            System.out.println("This word is palindrome word");
        } else {
            System.out.println("This is not a palindrome word");
        }

    }
}
