public int[] notAlone(int[] nums, int val) {
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == val) {
      if (i - 1 >= 0 && i + 1 < nums.length && nums[i - 1] != val) {
        nums[i] = nums[i - 1] > nums[i + 1] ? nums[i - 1] : nums[i + 1];
      }
    }
  }
  return nums;
}
