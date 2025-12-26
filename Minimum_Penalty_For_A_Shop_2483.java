class Minimum_Penalty_For_A_Shop_2483 {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int suffixY = 0;
        for(char ch : customers.toCharArray()){
            if(ch == 'Y'){
                suffixY++;
            }
        }
        int prefixN = 0;
…            int penalty = suffixY + prefixN;
            if(penalty < minPenalty){
                minPenalty = penalty;
                bestHour = j + 1;
            }
        }
        return bestHour;

    }
}