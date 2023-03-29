public int[] fix23(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
    if (count == 1) {
      nums[i] = 0;
      break;
    }
    if (i + 1 < nums.length && nums[i] == 2 && nums[i + 1] == 3) count+= 1;
  }
  return nums;
}
