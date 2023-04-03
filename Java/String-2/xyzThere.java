public boolean xyzThere(String str) {
  if (str.equals("xyz")) return true;
  
  for (int i = 0; i < str.length() - 3; i++) {
    if (i == 0 && str.substring(i, i + 3).equals("xyz")) return true;
    if (str.charAt(i) != '.' && str.substring(i + 1, i + 4).equals("xyz")) {
      return true;
    }
  }
  return false;
}
