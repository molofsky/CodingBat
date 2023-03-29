public int[] frontPiece(int[] nums) {
  int len = nums.length >= 2 ? 2 : nums.length;
  int [] result = new int[len];
  for (int i = 0; i < len; i++) {
    result[i] = nums[i];
  }
  return result;
}
