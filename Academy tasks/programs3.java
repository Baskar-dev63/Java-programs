import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;


public class codes {
    public static void main(String[] args) {

    }
}

//String reverse..
class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word :");
        String name = scanner.nextLine();
        String reverseName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseName = reverseName + name.charAt(i);
        }
        System.out.println(reverseName);
    }
}

//Checking a number is palindrome....
class palindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = scanner.nextInt();
        int last;
        int reverse = 0;

        for (int i = num; i != 0; i /= 10) {
            last = i % 10;
            reverse = reverse * 10 + last;
        }

        if (num == reverse) {
            System.out.println(num + " is palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number");
        }

    }
}

//Input="restart"   output="resta$t" problem..
class restart {
    public static void main(String[] args) {
        String word = "restart";
        int lastIndex = word.lastIndexOf('r');
        String changedWord = word.substring(0, lastIndex) + "$" + word.substring(lastIndex + 1);
        System.out.println(changedWord);
    }
}

//Joining another string in string using methods of strings..
class joined {
    public static void main(String[] args) {
        String word = "Abcde Bcgd";
        System.out.println(word.indexOf(" "));
        int lastIndex = word.lastIndexOf(' ');
        String join = word.substring(0, lastIndex) + " loves " + word.substring(lastIndex + 1);
        System.out.println(join);

    }
}

//Input=12345 ..Output=51234  problems like this ..
class change {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int last = arr[arr.length - 1];
        System.out.println(last);

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        for (int n : arr) {
            System.out.print(n);
        }
    }
}


//Unique Number in Arrays..
class uniqueNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(4);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) count++;
            }
            if (count == 1) {
                System.out.println(list.get(i));
            }
        }

    }
}


//Counting Elements of Array..
class newarraycount {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(5);
        list.add(1);
        System.out.println(list);
        ArrayList<Integer> newlist = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j))
                    count++;
            }
            newlist.add(count);
        }
        System.out.println(newlist);

    }
}

