class Sort_Integers_by_The_Number_Of_1_Bits_1356 {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Integer[] temp = new Integer[n];
        for(int i = 0; i < n; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp, (a, b) -> {
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);

            if (bitA == bitB) {
                return a - b;   
            }
            return bitA - bitB;
        });
        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
        return arr;
    }
}