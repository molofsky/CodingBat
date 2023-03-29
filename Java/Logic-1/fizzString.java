public String fizzString(String str) {
  String result = "";
  if (str.length() >= 1) {
    if (str.charAt(0) == 'f') result += "Fizz";
    if (str.charAt(str.length() - 1) == 'b') result += "Buzz";
  }
  return result.equals("") ? str : result;
}
