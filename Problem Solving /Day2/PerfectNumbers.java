 static void PerfectNumber(int a) {
        int count = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                count += i;
            }
        }
        if (a == count) {
            System.out.println(a + " is a perfect number..");
        } else {
            System.out.println(a + " is not a Perfect Number..");
        }
    }


//This is a static function ..
