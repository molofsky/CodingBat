public String zipZap(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++) {
    if (i + 2 < str.length()) {
      if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
        result += "zp";
        i+= 2;
      } else {
        result += str.charAt(i);
      }
    } else {
      result += str.charAt(i);
    }
  }
  return result;
}
