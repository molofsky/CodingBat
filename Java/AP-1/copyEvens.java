public int[] copyEvens(int[] nums, int count) {
  int[] res = new int[count];
  int idx = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) {
      res[idx] = nums[i];
      idx++;
      if (idx == count) break;
    }
  }
  return res;
}
