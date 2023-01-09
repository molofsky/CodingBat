def cat_dog(str):
  c_count = 0
  d_count = 0
  
  for i in range(len(str) - 2):
    if (str[i] + str[i + 1] + str[i + 2] == "cat"):
      c_count += 1
    if (str[i] + str[i + 1] + str[i + 2] == "dog"):
      d_count += 1
  return c_count == d_count
