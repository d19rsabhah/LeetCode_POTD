class Partitioning_Into_Minimum_Number_Of_Deci-Binary_Numbers_1689 {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for(char ch : n.toCharArray()){
            maxDigit = Math.max(maxDigit, ch - '0');
        }
        return maxDigit;
    }
}