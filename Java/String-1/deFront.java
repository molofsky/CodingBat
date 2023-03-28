public String deFront(String str) {  
  String result = "";
  if (str.length() >= 2) {
    if (str.charAt(0) == 'a') result += 'a';
    if (str.charAt(1) == 'b') result += 'b';
    if (str.length() > 2) result += str.substring(2);
  }
  return result;
    
}
