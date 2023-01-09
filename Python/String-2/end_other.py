def end_other(a, b):
  a_cpy = a.lower()
  b_cpy = b.lower()
  
  return a_cpy.endswith(b_cpy) or b_cpy.endswith(a_cpy)
