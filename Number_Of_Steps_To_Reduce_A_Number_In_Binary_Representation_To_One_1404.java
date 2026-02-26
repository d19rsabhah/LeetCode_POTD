class Number_Of_Steps_To_Reduce_A_Number_In_Binary_Representation_To_One_1404 {
    public int numSteps(String s) {
        int steps = 0, carry = 0;
        int l = s.length();
        
        for(int i = l - 1; i > 0; i--){
            int currBit = s.charAt(i) - '0';
            if(currBit + carry == 0){
                steps += 1;
            }else if(currBit + carry == 1){
                steps += 2;
                carry = 1;
            }else{
                steps += 1;
            }
        }

        int totalSteps = carry + steps;
        return totalSteps;
    }
}