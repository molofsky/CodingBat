def sum13(nums):
  sum = 0
  found13 = False
  
  for i in range(len(nums)):
    if (nums[i] == 13):
      found13 = True
    
    if not found13:
      sum += nums[i]
    elif (i - 1 >= 0 and nums[i - 1] == 13):
      found13 = False
      
  return sum
