public String withoutX2(String str) {
  String result = "";
  if (str.length() >= 1) {
    if (str.charAt(0) != 'x') result += str.charAt(0);
    if (str.length() >= 2 && str.charAt(1) != 'x') result += str.charAt(1);
    if (str.length() >= 3) result += str.substring(2);
  }
  return result;
}
