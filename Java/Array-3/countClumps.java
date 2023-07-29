public int countClumps(int[] nums) {
    int count = 0;
    Boolean clump = false;
    
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) {
          if (!clump) count += 1;
          clump = true;
        } else {
          clump = false;
        }
    }
    return count;
}
