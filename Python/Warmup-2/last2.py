def last2(str):
  count = 0
  last2 = str[-2:]
  for i in range(len(str) - 2):
    if (str[i:i+2] == last2):
      count+= 1
  return count
