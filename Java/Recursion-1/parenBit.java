public String parenBit(String str) {
  if (str.length() == 0) return "";
  if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
      return str + parenBit("");
  }
  if (str.charAt(0) != '(') return parenBit(str.substring(1, str.length()));
  if (str.charAt(str.length() - 1) != ')') return parenBit(str.substring(0, str.length() - 1));
  return parenBit(str);
}
