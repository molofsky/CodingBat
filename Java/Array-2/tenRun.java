public int[] tenRun(int[] nums) {
  boolean seenMult = false;
  int mult = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 10 == 0) {
      seenMult = true;
      mult = nums[i];
    }
    if (seenMult) nums[i] = mult;
  }
  return nums;
}
