public String starOut(String str) {
  String result = "";
  int i = str.indexOf("*"), cur = 0;
  if (i == -1) return str;
  if (i == 0 && str.length() == 1) return "";
  
  while (i != -1) {
    if (i - 1 >= 0) { 
      result += str.substring(cur, i - 1);
    }
    cur = i + 2;
    i = str.indexOf("*", i + 1);
    if (cur >= i && i != -1) cur = i - 1;
  }
  if (cur < str.length()) result += str.substring(cur, str.length());
  return result;
}
