class Concatenation_Of_Consecutive_Binary_Numbers_1680 {

    static int MOD = 1000000007;
    public int concatenatedBinary(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(decimalToBinary(i));
        }
        return binaryToDecimal(sb.toString());
    }

    public static String decimalToBinary(int n) {
        if (n == 0)
            return "0";

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }
    public static int binaryToDecimal(String s) {
    long result = 0;
    for (int i = 0; i < s.length(); i++) {
        result = (result * 2 + (s.charAt(i) - '0')) % MOD;
    }
    return (int) (result % MOD);
}
}