public int[] copyEndy(int[] nums, int count) {
  int[] res = new int[count];
  int idx = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (isEndy(nums[i])) {
      res[idx] = nums[i];
      idx++;
      if (idx == count) break;
    }
  }
  return res;
}

public boolean isEndy(int n) {
  if ((n >= 0 && n <= 10) || (n >= 90 && n <= 100)) return true;
  return false;
}
