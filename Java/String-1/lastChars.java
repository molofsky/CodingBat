public String lastChars(String a, String b) {
  String a_res = "", b_res = "";
  a_res = a.length() > 0 ? a.substring(0, 1) : "@";
  b_res = b.length() > 0 ? b.substring(b.length() - 1) : "@";
  return a_res + b_res;
}
