public int[] zeroFront(int[] nums) {
  int[] result = new int[nums.length];
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
      result[count] = 0;
      count++;
    }
  }
  for (int j = 0; j < nums.length; j++) {
    if (nums[j] != 0) {
      result[count] = nums[j];
      count++;
    }
  }
  return result;
}
