public int maxSpan(int[] nums) {
  int span = 0;
  
  for (int i = 0; i < nums.length; i++) {
      int last_idx = nums.length - 1;
      
      while (nums[i] != nums[last_idx]) last_idx--;
      
      int cur_span = last_idx - i + 1;
      span = span > cur_span ? span : cur_span;
  }
  
  return span;
}
