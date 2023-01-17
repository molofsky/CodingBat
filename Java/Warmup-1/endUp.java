public String endUp(String str) {
  int len = str.length();
  if (len < 3) return str.toUpperCase();
  
  String end = str.substring(len - 3, len);
  return str.substring(0, len - 3) + end.toUpperCase();
}
