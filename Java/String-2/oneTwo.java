public String oneTwo(String str) {
  String result = "";
  for (int i = 0; i < str.length() - 2; i+= 3) {
    if (i + 2 < str.length()) {
      result += str.substring(i + 1, i + 3);
      result += str.charAt(i);
    } else {
      result += str.substring(i);
    }
  }
  return result;
}
