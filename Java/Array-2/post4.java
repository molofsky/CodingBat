public int[] post4(int[] nums) {
  int[] result;
  int index = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) index = i;
  }
  result = Arrays.copyOfRange(nums, index + 1, nums.length);
  return result;
}
