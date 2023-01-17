public boolean mixStart(String str) {
  if (str.length() < 3) return false;
  String target = str.substring(1, 3);
  return (target.equals("ix"));
}
