public String notReplace(String str) {
  String target = "is";
  String result = "";
  
  for (int i = 0; i < str.length(); i++) {
    if (i + 1 < str.length() && str.substring(i, i + 2).equals(target)
    && (i + 2 >= str.length() || !Character.isLetter(str.charAt(i + 2))) 
    && (i - 1 < 0 || !Character.isLetter(str.charAt(i - 1)))) {
      result += target + " not";
      i++;
    } else {
      result += str.charAt(i);
    }
  }
  return result;
}
