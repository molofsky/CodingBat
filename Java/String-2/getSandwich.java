public String getSandwich(String str) {
  int start = str.indexOf("bread"), end = str.lastIndexOf("bread");
  if (start == -1 || end == -1 || start == end) return "";
  return str.substring(start + 5, end);
}
