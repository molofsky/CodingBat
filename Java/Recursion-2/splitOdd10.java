public boolean splitOdd10(int[] nums) {
  return splitOdd10Helper(nums, 0, 0, 0);
}

public boolean splitOdd10Helper(int[] nums, int idx, int sum1, int sum2) {
    if (idx >= nums.length) {
      return (sum1 % 10 == 0 && sum2 % 2 == 1 || sum2 % 10 == 0 && sum1 % 2 == 1);
    }
    
    if (splitOdd10Helper(nums, idx + 1, sum1 + nums[idx], sum2)) return true;
    if (splitOdd10Helper(nums, idx + 1, sum1, sum2 + nums[idx])) return true;
    
    return false;
}
