public boolean splitArray(int[] nums) {
  return splitArrayHelper(nums, 0, 0, 0);
}

public boolean splitArrayHelper(int[] nums, int idx, int sum1, int sum2) {
    if (idx == nums.length) return sum1 == sum2;
    
    if (splitArrayHelper(nums, idx + 1, sum1 + nums[idx], sum2)) return true;
    if (splitArrayHelper(nums, idx + 1, sum1, sum2 + nums[idx])) return true;
    return false;
}
