public int[] maxEnd3(int[] nums) {
  int max = Math.max(nums[0], nums[2]);
  for (int i = 0; i < 3; i++) {
    nums[i] = max;
  }
  return nums;
}
