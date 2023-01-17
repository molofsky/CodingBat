public String front3(String str) {
  String result = "";
  int len = str.length();
  if (len < 3) {
    for (int i = 0; i < 3; i++) result += str;
  } else {
    String front = str.substring(0, 3);
    for (int i = 0; i < 3; i++) result += front;
  }
  return result;
}
