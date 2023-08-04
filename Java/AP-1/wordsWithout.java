public String[] wordsWithout(String[] words, String target) {
  int count = 0;
  for (int i = 0; i < words.length; i++) {
    if (words[i].equals(target)) count++;
  }
  String[] res = new String[words.length - count];
  int idx = 0;
  
  for (int i = 0; i < words.length; i++) {
    if (!words[i].equals(target)) {
      res[idx] = words[i];
      idx++;
    }
  }
  return res;
}
