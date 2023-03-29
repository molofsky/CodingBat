public int sum2(int[] nums) {
  int cap = nums.length > 2 ? 2 : nums.length;
  int sum = 0;
  for (int i = 0; i < cap; i++) {
    sum += nums[i];
  }
  return sum;
}
