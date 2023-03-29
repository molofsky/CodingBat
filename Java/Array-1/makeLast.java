public int[] makeLast(int[] nums) {
  int [] result = new int[nums.length * 2];
  int last = nums[nums.length - 1];
  
  for (int i = 0; i < nums.length * 2; i++) {
    result[i] = 0;
    if (i == nums.length * 2 - 1)  result[i] = last;
  }
  
  return result;
}

