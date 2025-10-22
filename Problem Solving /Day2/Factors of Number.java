import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to find the factors of the Number: ");
        int a= scanner.nextInt();
        System.out.println("Printing factors of "+a);
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
    }
}
