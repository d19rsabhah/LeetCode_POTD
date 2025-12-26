class Maximize_Happiness_Of_Selected_Children_3075 {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness); 
        long sum = 0;
        int dec = 0;
        int n = happiness.length;

        for (int i = n - 1; i >= 0 && k > 0; i--) {
            int val = happiness[i] - dec;
            if (val <= 0)
                break;

            sum += val;
            dec++;
            k--;
        }

        return sum;
    }
}