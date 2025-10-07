import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How Many element want to add:");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter your Elements:");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Printing the given values:");

        for (int i = 0; i < length; i++) {
            System.out.println(i + "th index value in array:" + arr[i]);
        }
    }
}

class reversearray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How Many element want to add:");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter your Elements:");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Printing the given values:");

        for (int i = length - 1; i >= 0; i--) {
            System.out.println(i + "th index value in array:" + arr[i]);
        }
    }
}


class sumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How Many element want to Add in Array:");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter your Elements:");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Printing the given values:");
        int result = 0;

        for (int i = 0; i < length; i++) {
            System.out.println(i + "th index value in array:" + arr[i]);
            result = result + arr[i];
        }

        System.out.println("Sum of the Array values: " + result);
    }
}


class compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How Many element want to Add in Array:");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter your Elements:");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Printing the given values:");
        int biggestnum = arr[0];
        int smallestnum = arr[0];

        for (int i = 1; i < length; i++) {
            System.out.println(i + "th index value in array:" + arr[i]);
            if (arr[i] > biggestnum) {
                biggestnum = arr[i];
            }
            if (arr[i] < smallestnum) {
                smallestnum=arr[i];
            }
        }
        System.out.println("Biggest Number in the Array: " + biggestnum);
        System.out.println("Smallest Number in the Array: " + smallestnum);

    }
}