public String repeatSeparator(String word, String sep, int count) {
  String result = "";
  for (int i = 0; i < count; i++) {
    if (i + 1 != count) result += word + sep;
    else result += word;
  }
  return result;
}
