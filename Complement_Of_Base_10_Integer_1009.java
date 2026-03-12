class Complement_Of_Base_10_Integer_1009 {
    public int bitwiseComplement(int n) {
        if(n == 0) {
            return 1;
        }

        int temp = n;
        int mask = 0;
        while(temp > 0){
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        return n ^ mask;
		/*
		if (n == 0) return 1;
        int mask = n;
        for (int i = 0; i <= 4; i++)
            mask |= mask >> (1 << i);
        return ~n & mask;
		*/
    }
}

