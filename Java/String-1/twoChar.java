public String twoChar(String str, int index) {
  int len = str.length();
  if (index < 0 || len < index + 2) return str.substring(0, 2);
  else return str.substring(index, index + 2);
}
