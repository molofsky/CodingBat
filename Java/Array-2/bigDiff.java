public int bigDiff(int[] nums) {
  int max = nums[0], min = max;
  for (int i = 0; i < nums.length; i++) {
    max = Math.max(nums[i], max);
    min = Math.min(nums[i], min);
  }
  return max - min;
}
