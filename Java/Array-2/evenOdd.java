public int[] evenOdd(int[] nums) {
  int[] result = new int[nums.length];
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) {
      result[count] = nums[i];
      count++;
    }
  }
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 1) {
      result[count] = nums[i];
      count++;
    }
  }
  return result;
}
