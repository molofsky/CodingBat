public String repeatEnd(String str, int n) {
  String result = "";
  for (int i = 0; i < n; i++) result += str.substring(str.length() - n, str.length());
  return result;
}
