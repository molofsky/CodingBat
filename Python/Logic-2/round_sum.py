def round_sum(a, b, c):
  sum = round10(a) + round10(b) + round10(c)
  return sum
  
def round10(n):
  mod = n % 10
  if (mod >= 5): return n + 10 - mod
  else:return n - mod
