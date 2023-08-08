public boolean groupSumClump(int start, int[] nums, int target) {
  if (start >= nums.length) return target == 0;
  
  if (start + 1 < nums.length) {
    if (nums[start] != nums[start + 1]) {
      if (groupSumClump(start + 1, nums, target - nums[start])) return true;
      if (groupSumClump(start + 1, nums, target)) return true;
    } else {
      int i = 0;
      int target_cpy = target;
      while (nums[start] == nums[start + i]) {
        target_cpy -= nums[start];
        i++;
      }
      if (groupSumClump(start + i, nums, target_cpy)) return true;
      if (groupSumClump(start + i, nums, target)) return true;
    }
  } else {
    if (groupSumClump(start + 1, nums, target - nums[start])) return true;
    if (groupSumClump(start + 1, nums, target)) return true;
  }
  
  return false;
}
