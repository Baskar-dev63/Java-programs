import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num= scanner.nextInt();
        int reverse = 0;
        int last;
        for(int n=num;n!=0;n=n/10){
            last = n % 10;
            reverse=reverse*10+ last;
        }
        if(num==reverse){
            System.out.println(reverse+" is palindrome Number.");
        }
        else{
            System.out.println(reverse+" Not a Palindrome Number.");
        }
    }
}
