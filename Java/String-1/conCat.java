public String conCat(String a, String b) {
  if (a.length() < 1 && b.length() < 1) return "";
  if (a.length() < 1) return b;
  if (b.length() < 1) return a;
  
  String omit = a.substring(0, a.length() - 1);
  return a.charAt(a.length() - 1) == b.charAt(0) ? omit + b : a + b;
}
