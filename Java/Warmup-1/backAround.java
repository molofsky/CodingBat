public String backAround(String str) {
  int len = str.length();
  if (len <= 0) return "";
  char last = str.charAt(len - 1);
  return last + str + last;
}
