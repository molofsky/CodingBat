public int sum67(int[] nums) {
  boolean seen6 = false;
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 6) {
      seen6 = true;
    }
    if (!seen6) {
      count += nums[i];
    }
    if (nums[i] == 7) {
      seen6 = false;
    }
  }
  return count;
}
