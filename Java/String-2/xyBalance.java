public boolean xyBalance(String str) {
  Boolean xSeen = false, ySeen = false;
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'x') xSeen = true;
    if (str.charAt(i) == 'y') {
      ySeen = true;
      xSeen = false;
    }
  }
  if (xSeen && ySeen) return false;
  if (xSeen == false) return true;
  return ySeen;
}
