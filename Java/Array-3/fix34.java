public int[] fix34(int[] nums) {
  int cur = 0;
  while (cur < nums.length && !(nums[cur] == 4 && (cur == 0 || nums[cur - 1] != 3))) {
    cur++;
  }
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 3 && nums[i + 1] != 4) {
        nums[cur] = nums[i + 1];
        nums[i + 1] = 4;
        
        while (cur < nums.length && !(nums[cur] == 4 && (cur == 0 || nums[cur - 1] != 3))) { {
          cur++;
        }
        }
    } 
  }
  
  return nums;
}
