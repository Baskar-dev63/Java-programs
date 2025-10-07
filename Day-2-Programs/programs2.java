import java.util.Scanner;

//Powers of a Number:
public class programs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to square:");
        int num = scanner.nextInt();
        int square = 1;
        System.out.println("Enter the power's range to print");
        int n = scanner.nextInt();
        System.out.println("Printing " + num + " Power " + n);
        for (int i = 1; i <= n; i++) {
            square = square * num;
            System.out.println(square);
        }

    }
}

//Squares:
class powers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range of squares:");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i * i);
        }
    }
}

//Count Digits:
class countNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = scanner.nextInt();
//        int countnumber = (int) Math.log10(num) + 1;
//        System.out.println("Count of given Number: " + countnumber);
        int count = 0;
        for (int i = num; i != 0; i /= 10) {
            count += 1;
        }
        System.out.println("count of given Numbers: " + count);
    }
}

class countingDivision {
    public static void main(String[] args) {
        int num = 35;
        int base = 2;
        int add = 0;
        for (int i = 1; i <= 5; i++) {
            num = num / base;
            add = add + 1;
            System.out.println("result:" + num);
        }
        System.out.println("counted:" + add);
    }
}


class addingvalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = scanner.nextInt();
        int addingvalue = 0;
        int digits;
//        while(num!=0){
//            digits=num%10;
//            addingvalue=addingvalue+digits;
//            num/=10;
//        }

        for (int i = num; i != 0; i /= 10) {
            digits = i % 10;
            addingvalue = addingvalue + digits;
        }
        System.out.println("Added value of Given value: " + addingvalue);

    }
}

class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();
        int armstrong = 0;
        int getvalue;
        for (int i = num; i != 0; i /= 10) {
            getvalue = i % 10;
            armstrong = armstrong + getvalue * getvalue * getvalue;
        }
        if (num == armstrong) {
            System.out.println("This is Armstrong Number: " + armstrong);
        } else {
            System.out.println("This is not a Armstrong Number.");
        }

    }
}