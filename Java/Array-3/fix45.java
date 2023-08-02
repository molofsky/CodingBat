public int[] fix45(int[] nums) {
  int cur = 0;
  
  while (cur < nums.length && nums[cur] != 5) cur++;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      nums[cur] = nums[i + 1];
      nums[i + 1] = 5;
      while (cur < nums.length && !(nums[cur] == 5 && (cur == 0 || nums[cur - 1] != 4))) cur++;
    }
  }
  return nums;
}
