public String startWord(String str, String word) {
  String result = "";
  int w_len = word.length();
  if (str.length() >= w_len) {
    if (str.substring(1, w_len).equals(word.substring(1))) {
      result += str.substring(0, w_len);
    }
  }
  return result;
}
