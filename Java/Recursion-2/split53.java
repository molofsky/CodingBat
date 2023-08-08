public boolean split53(int[] nums) {
  return split53Helper(nums, 0, 0, 0);
}

public boolean split53Helper(int[] nums, int idx, int sum1, int sum2) {
  if (idx >= nums.length) return sum1 == sum2;
  
  if (nums[idx] % 5 == 0 && nums[idx] % 3 != 0) {
    if (split53Helper(nums, idx + 1, sum1 + nums[idx], sum2)) return true;
  }
  
  if (nums[idx] % 3 == 0) {
    if (split53Helper(nums, idx + 1, sum1, sum2 + nums[idx])) return true;
  }
  
  if (nums[idx] % 5 != 0 && nums[idx] % 3 != 0) {
    if (split53Helper(nums, idx + 1, sum1 + nums[idx], sum2)) return true;
    if (split53Helper(nums, idx + 1, sum1, sum2 + nums[idx])) return true;
  }
  
  return false;
}
