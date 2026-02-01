class Divide_An_Array_Into_Subarrays_With_Minimum_Cost_I_3010 {
    public int minimumCost(int[] nums) {
        int div1 = nums[0];
        int div2 = Integer.MAX_VALUE;
        int div3 = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(nums[i] < div2){
                div3 = div2;
                div2 = nums[i];
            }else if(nums[i] < div3){
                div3 = nums[i];
            }
        }

        return div1 + div2 + div3;
    }
}