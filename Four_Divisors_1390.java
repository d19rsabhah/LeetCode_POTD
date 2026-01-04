class Four_Divisors_1390 {

    public int sumFourDivisors(int[] nums) {
        int total = 0;

        for (int n : nums) {
            for (int i = 2; i * i <= n; i++) {

                if (n % i == 0) {
                    int p = i;
                    int q = n / i;

                    // Case 1: p * q (distinct primes)
                    if (p != q && isPrime(p) && isPrime(q)) {
                        total += 1 + p + q + n;
                    }

                    // Case 2: p^3
                    else if (q == p * p && isPrime(p)) {
                        total += 1 + p + q + n;
                    }

                    break; // only first divisor needed
                }
            }
        }
        return total;
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
