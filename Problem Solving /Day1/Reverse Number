class reversenumber{
    public static void main(String[] args) {

        // In this logic using 0 values in last. cant print it as given reverse num.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        long num=scanner.nextLong();
        long last;
        long reverse=0;
        for(long i=num;i!=0;i/=10){
            last=i%10;
            reverse=reverse*10+last;
        }
        System.out.println("Its the reversed Number: "+reverse);
    }
}
