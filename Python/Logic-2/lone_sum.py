def lone_sum(a, b, c):
  sum = a + b + c
  
  if (a == c and b == c and a == b):
    return 0
    
  if (a == c):
    sum -= a + c
  if (b == c):
    sum -= b + c
  if (a == b):
    sum -= b + a
    
  return sum
