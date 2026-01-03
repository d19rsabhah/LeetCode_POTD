class Number_Of_Ways_To_Paint_N_X_3_Grid_1411 {
    public int numOfWays(int n) {
        int MOD = (int)1e9 + 7;

        long aba = 6, abc = 6;

        for (int i = 2; i <= n; i++) {
            long new_aba = (3 * aba + 2 * abc) % MOD;
            long new_abc = (2 * aba + 2 * abc) % MOD;
            aba = new_aba;
            abc = new_abc;
        }

        return (int)((aba + abc) % MOD);
    }
}