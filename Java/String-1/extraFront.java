public String extraFront(String str) {
  String start = str.length() < 2 ? str : str.substring(0, 2);
  return start + start + start;
}
