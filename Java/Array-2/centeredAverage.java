public int centeredAverage(int[] nums) {
  int len = nums.length, max = nums[0], min = nums[0], sum = 0;
  for (int i = 0; i < len; i++) {
    max = Math.max(nums[i], max);
    min = Math.min(nums[i], min);
    sum += nums[i];
  }
  return (sum - max - min)/(len - 2);
}
