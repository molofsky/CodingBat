def combo_string(a, b):
  a_len = len(a)
  b_len = len(b)
  
  if (b_len > a_len):
    return a + b + a
  else:
    return b + a + b
