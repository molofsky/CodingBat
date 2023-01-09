def front_back(str):
  if (len(str) <= 1):
    return str
  else:
    start = str[0]
    end = str[-1]
    s = list(str)
    s[0] = end
    s[-1] = start
    return "".join(s)
