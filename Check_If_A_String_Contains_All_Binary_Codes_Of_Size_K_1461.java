class Check_If_A_String_Contains_All_Binary_Codes_Of_Size_K_1461 {
	
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        int subStringNeeded = 1 << k;
        if(n - k + 1 < subStringNeeded){
            return false;
        }
        int totalPossibleSubString = buildSubString(s, k, n);
        if(totalPossibleSubString == subStringNeeded){
            return true;
        }
        return false;
    }
	
    public int buildSubString(String s, int k, int n){
        Set<String> distSubStrings = new HashSet<>();
        for(int i = 0; i <= n - k; i++){
            distSubStrings.add(s.substring(i, i + k));
        }
        return distSubStrings.size();
    }
	
}