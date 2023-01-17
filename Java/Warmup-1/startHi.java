public boolean startHi(String str) {
  int len = str.length();
  if (len < 2) return false;
  String hi = str.substring(0, 2);
  return hi.equals("hi");
}
