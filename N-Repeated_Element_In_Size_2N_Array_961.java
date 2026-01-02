class N-Repeated_Element_In_Size_2N_Array_961{
	public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            if(set.contains(x)){
                return x;
            }
            set.add(x);
        }
        return -1;
    }

}