def xyz_there(str):
  include = "xyz"
  
  for i in range(len(str) - 2):
    if (str[i - 1] != "." and str[i:i+3] == include):
      return True
  return False
