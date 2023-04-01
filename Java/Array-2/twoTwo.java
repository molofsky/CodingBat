public boolean twoTwo(int[] nums) {
  if (nums.length == 1 && nums[0] == 2) return false;
  else if (nums.length <= 1) return true;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) {
      if (i - 1 >= 0 && i + 1 >= nums.length) {
        if (nums[i - 1] != 2) return false;
      }
      if (i - 1 < 0 && i + 1 < nums.length) {
        if (nums[i + 1] != 2) return false;
      }
      
      if (i - 1 >= 0 && i + 1 < nums.length) {
        if (nums[i + 1] != 2 && nums[i - 1] != 2) return false;
      }
    }
  }
  return true;
}
