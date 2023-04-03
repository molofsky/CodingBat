public String mixString(String a, String b) {
  String result = "";
  if (a.length() >= b.length()) { 
    for (int i = 0; i < b.length(); i++) {
      result += a.charAt(i);
      result += b.charAt(i);
    }
    if (a.length() > b.length()) result += a.substring(b.length(), a.length());
    
  } else {
    for (int i = 0; i < a.length(); i++) {
      result += a.charAt(i);
      result += b.charAt(i);
    }
    result += b.substring(a.length(), b.length());
  }
  return result;
}
