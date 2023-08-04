public int count11(String str) {
  if (str.length() <= 1) return 0;
  if (str.substring(0, 2).equals("11")) {
    if (str.length() >= 3) return 1 + count11(str.substring(2, str.length()));
    return 1 + count11(str.substring(1, str.length()));
  }
  return count11(str.substring(1, str.length()));
}
