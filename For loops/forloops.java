import java.util.Scanner;
public  class forloops{

     static void Table(int table, int range) {
        for (int i = 1; i <= range; i++) {
            System.out.println(i + "X" + table + "= " + (i * table));
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

       Table(5,10);   //Here  first args means which table and second args range of table to print .//Example 5th table to start to end(10X5=50)
        
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
