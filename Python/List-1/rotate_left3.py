def rotate_left3(nums):
  
  first = nums[0]
  for i in range(len(nums)):
    if (i == len(nums) - 1):
      nums[i] = first
    else:
      nums[i] = nums[i + 1]
  return nums
