public String altPairs(String str) {
  String result = "";
  int i = 0, end = 0;
  while (i < str.length()) {
    if (i + 2 > str.length()) end = str.length();
    else end = i + 2;
    result += str.substring(i, end);
    i+=4;
  }
  return result;
}
