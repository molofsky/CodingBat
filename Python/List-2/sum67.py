def sum67(nums):
  sum = 0
  found_6  = False
  
  for i in range(len(nums)):
    if (nums[i] == 6):
      found_6 = True
    
    if not found_6:
      sum += nums[i]
    else:
      if (nums[i] == 7):
        found_6 = False
  
  return sum
