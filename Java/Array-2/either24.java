public boolean either24(int[] nums) {
  boolean double2 = false, double4 = false;
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == 2 && nums[i + 1] == 2) double2 = true;
    if (nums[i] == 4 && nums[i + 1] == 4) double4 = true;
  }
  return double2 ^ double4;
}
