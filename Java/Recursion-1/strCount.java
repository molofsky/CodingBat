public int strCount(String str, String sub) {
  if (str.length() == 0) return 0;
  if (sub.length() <= str.length() &&
    str.substring(0, sub.length()).equals(sub)) {
    return 1 + strCount(str.substring(sub.length(), str.length()), sub);
  }
  return strCount(str.substring(1, str.length()), sub);
}
