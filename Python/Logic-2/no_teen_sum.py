def no_teen_sum(a, b, c):
  sum = fix_teen(a) + fix_teen(b) + fix_teen(c)
  return sum

def fix_teen(n):
  if (n != 16 and n != 15):
    if (n <= 19 and n >= 13):
      return 0
  return n
