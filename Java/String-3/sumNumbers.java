public int sumNumbers(String str) {
  int count = 0;
  String num = "0";
  
  for (int i = 0; i < str.length(); i++) {
    char cur = str.charAt(i);
    if (Character.isDigit(cur)) {
      num += cur;
    } else {
      count += Integer.parseInt(num);
      num = "0";
    }
  }
  return count + Integer.parseInt(num);
}
