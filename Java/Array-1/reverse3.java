public int[] reverse3(int[] nums) {
  int[] result = new int[3];
  for (int i = 0; i < nums.length; i++) {
      result[i] = nums[nums.length - 1 - i];
  }
  return result;
}

