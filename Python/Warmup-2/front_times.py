def front_times(str, n):
  result = ""
  front = ""
  if (len(str) < 3):
    front = str
  else:
    front = str[0:3]
  
  for i in range(n):
    result += front
  return result
