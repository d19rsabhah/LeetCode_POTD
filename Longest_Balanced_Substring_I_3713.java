class Longest_Balanced_Substring_I_3713 {
    public int longestBalanced(String s) {
        int n = s.length();
        int ans = 0;
        int track[] = new int[26];
        for(int i = 0; i < n; i++){
            Arrays.fill(track, 0);
            int mxFreq = 0, val = 0;
            for(int j = i; j < n; j++){
                char ch = s.charAt(j);
                int idx = ch - 'a';
                track[idx]++;
                if(track[idx] == 1){
                    val++;
                }
                mxFreq = Math.max(track[idx], mxFreq);
                if(mxFreq * val == j - i + 1){
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}