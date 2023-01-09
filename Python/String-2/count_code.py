def count_code(str):
  count = 0
  
  for i in range(len(str) - 3):
    if (str[i] + str[i +1] + str[i + 3] == "coe"):
      count += 1
  return count
