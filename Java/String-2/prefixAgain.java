public boolean prefixAgain(String str, int n) {
  if (str.length() == 2 && n == 1 && str.charAt(0) == str.charAt(1)) return true;
  String substr = str.substring(0, n);
  for (int i = n; i < str.length() - n; i++) {
    if (str.substring(i, i + n).equals(substr)) return true;
  }
  return false;
}
