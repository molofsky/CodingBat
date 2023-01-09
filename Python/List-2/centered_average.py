def centered_average(nums):
  
  count = 0
  min = nums[0]
  max = nums[0]
  
  for i in range(len(nums)):
    if (min > nums[i]): min = nums[i]
    if (max < nums[i]): max = nums[i]
    count += nums[i]
  
  return (count - max - min)/(len(nums) - 2)
