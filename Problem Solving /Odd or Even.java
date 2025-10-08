class EvenOrAdd{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println(num+" its a Even Number");
        }
        else{
            System.out.println(num+" its a Odd Number");
        }
    }
}
