public int countTriple(String str) {
  int count = 0;
  for (int i = 0; i < str.length(); i++) {
    if (i - 1 >= 0 && i + 1 < str.length()) {
      if (str.charAt(i) == str.charAt(i + 1) 
          && str.charAt(i) == str.charAt(i - 1)) count++;
    }
  }
  return count;
}
