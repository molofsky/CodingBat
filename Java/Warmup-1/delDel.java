public String delDel(String str) {
  if (str.length() < 4) return str;
  String del = str.substring(1, 4);
  if (del.equals("del")) return str.charAt(0) + str.substring(4, str.length());
  return str;
}
