def max_end3(nums):
  large = max(nums[0], nums[-1])
  
  for i in range(len(nums)):
    nums[i] = large
  return nums
