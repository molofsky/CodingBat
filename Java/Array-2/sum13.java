public int sum13(int[] nums) {
  boolean seen13 = false;
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 13) {
      if (seen13) seen13 = false;
      else sum += nums[i];
    } else {
      seen13 = true;
    }
  }
  return sum;
}
