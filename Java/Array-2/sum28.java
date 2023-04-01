public boolean sum28(int[] nums) {
  int count2 = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) count2 += 2;
  }
  if (count2 == 8) return true;
  return false;
}
