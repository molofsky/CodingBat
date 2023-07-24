public String sameEnds(String string) {
  String res = "";
  int len = string.length();
  for (int i = string.length()/2; i > 0; i--) {
    String start = string.substring(0, i);
    String end = string.substring(len - i, len);
    if (start.equals(end)) {
      res = start;
      break;
    }
  }
  return res;
}
