public String wordEnds(String str, String word) {
  String result = "";
  int index = str.indexOf(word);
  while (index != -1) {
    if (index - 1 >= 0) result += str.charAt(index - 1);
    if (index + word.length() < str.length()) {
      result += str.charAt(index + word.length());
    }
    index = str.indexOf(word, index + 1);
  }
  return result;
}
