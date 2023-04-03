public boolean xyzMiddle(String str) {
  if (str.length() < 3) return false;
  int i = str.indexOf("xyz");
  while (i != -1) {
    if (Math.abs(i - (str.length() -(i + 3))) <= 1) return true;
    i = str.indexOf("xyz", i + 1);
  }
  return false;
}
