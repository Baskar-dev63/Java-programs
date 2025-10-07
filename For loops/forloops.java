import java.util.Scanner;
public  class forloops{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the range to print the table: ");
        int range=scanner.nextInt();
        System.out.println("Enter which table want to print: ");
        int table=scanner.nextInt();

        for(int i=1;i<=range;i++){
            System.out.println(i+"X"+table+"= "+(i*table));
        }

         //Patterns :
        
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
