public String plusOut(String str, String word) {
  String result = "";
  int cur = 0, i = str.indexOf(word);
  while (i != -1) {
    for (int j = 0; j < i - cur; j++) result += '+';
    result += word;
    cur = i + word.length();
    if (word.length() == 2 && word.charAt(0) == word.charAt(1)) i = str.indexOf(word, i + 2);
    else i = str.indexOf(word, i + 1);
  }
  for (int k = cur; k < str.length(); k++) result += '+';
  return result;  
}
