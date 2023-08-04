public boolean strCopies(String str, String sub, int n) {
  if (n == 0) return true;
  if (str.length() == 0) return false;
  
  if (sub.length() <= str.length() &&
    str.substring(0, sub.length()).equals(sub)) {
      return strCopies(str.substring(1, str.length()), sub, n - 1);
    }
  return strCopies(str.substring(1, str.length()), sub, n);
}
