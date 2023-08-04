public List wordsWithoutList(String[] words, int len) {
    ArrayList<String> arr = new ArrayList<String>();
    
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() != len) {
        arr.add(words[i]);
      }
    }
    return arr;
}
