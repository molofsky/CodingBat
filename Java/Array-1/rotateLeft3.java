public int[] rotateLeft3(int[] nums) {
  int[] result = new int[3];
  for (int i = 0; i < nums.length - 1; i++) {
    result[i] = nums[i+1];
  }
  result[2] = nums[0];
  return result;
}
