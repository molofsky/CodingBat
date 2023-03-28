public String withouEnd2(String str) {
  int len = str.length();
  if (len <= 1) return "";
  return str.substring(1, str.length() - 1);
}
