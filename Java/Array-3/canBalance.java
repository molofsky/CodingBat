public boolean canBalance(int[] nums) {
  int sum = 0;
  int left = 0;
  
  for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
  }
  
  for (int i = 0; i < nums.length; i++) {
    sum -= nums[i];
    left += nums[i];
    if (sum == left) return true;
  }
  return false;
}
