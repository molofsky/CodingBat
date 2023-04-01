public boolean isEverywhere(int[] nums, int val) {
  boolean isOdd = true, isEven = true;
  for (int i = 0; i < nums.length; i++) {
    if (i % 2 == 0 && nums[i] != val) isOdd = false;
    if (i % 2 == 1 && nums[i] != val) isEven = false;
  }
  return isOdd || isEven;
}
