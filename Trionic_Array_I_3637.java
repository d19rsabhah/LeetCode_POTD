class Trionic_Array_I_3637 {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

        int state = 0;
        boolean inc1 = false, dec = false, inc2 = false;

        for (int i = 0; i < n - 1; i++) {
            if (state == 0) {
                if (nums[i] < nums[i + 1]) {
                    inc1 = true;
                } else if (nums[i] > nums[i + 1] && inc1) {
                    state = 1;
                    dec = true;
                } else {
                    return false;
                }
            } else if (state == 1) {
                if (nums[i] > nums[i + 1]) {
                    dec = true;
                } else if (nums[i] < nums[i + 1] && dec) {
                    state = 2;
                    inc2 = true;
                } else {
                    return false;
                }
            } else {
                if (nums[i] < nums[i + 1]) {
                    inc2 = true;
                } else {
                    return false;
                }
            }
        }

        return inc1 && dec && inc2;
    }
}
