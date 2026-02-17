class Reverse_Bits_190 {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;        // shift result left
            int lastBit = n & 1; // get last bit
            result |= lastBit;   // add last bit to result
            n >>= 1;             // shift n right
        }

        return result;
    }
}
