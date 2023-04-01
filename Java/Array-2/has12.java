public boolean has12(int[] nums) {
  boolean seen1 = false;
  for (int i = 0; i < nums.length; i++) {
    if (seen1 && nums[i] == 2) return true;
    if (nums[i] == 1) seen1 = true;
  }
  return false;
}
