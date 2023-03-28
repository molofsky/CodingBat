public boolean frontAgain(String str) {
  if (str.length() < 2) return false;
  return str.substring(str.length() - 2, str.length()).equals(str.substring(0, 2));
}
