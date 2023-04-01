public int[] pre4(int[] nums) {
  int [] result;
  int i = 0;
  while (i < nums.length) {
    if (nums[i] == 4) break;
    i++;
  }
  result = Arrays.copyOfRange(nums, 0, i);
  return result;
}
