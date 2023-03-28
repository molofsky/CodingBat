public String comboString(String a, String b) {
  int max = Math.max(a.length(), b.length());
  if (max == a.length()) return b + a + b;
  else return a + b + a;
}
