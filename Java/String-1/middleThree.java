public String middleThree(String str) {
  int len = str.length()/2;
  return str.substring(len - 1, len) + str.substring(len, len + 2);
}
