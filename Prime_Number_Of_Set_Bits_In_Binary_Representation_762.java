class Prime_Number_Of_Set_Bits_In_Binary_Representation_762 {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++){
            int bitCount = Integer.bitCount(i);
            if(isPrime(bitCount)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}