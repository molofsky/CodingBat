public String front22(String str) {
  int len = str.length();
  if (len < 2) {
    return str + str + str;
  } else {
    String firsttwo = str.substring(0, 2);
    return firsttwo + str + firsttwo;
  }
}
