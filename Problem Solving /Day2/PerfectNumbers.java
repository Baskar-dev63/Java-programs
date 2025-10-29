public class main {

    static boolean isPerfect(int n) {
        if (n == 1) {
            return false;
        }
        int count = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += i;
                if (i != n / i) {
                    count += n / i;
                }
            }
        }
        return n==count;
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(28));
        System.out.println(isPerfect(19));
    }
}
