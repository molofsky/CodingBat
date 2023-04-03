public int countCode(String str) {
  int count = 0;
  for (int i = 0; i < str.length() - 3; i++) {
    if (str.charAt(i + 3) == 'e' 
        && str.substring(i, i + 2).equals("co")) count++;
  }
  return count;
}
