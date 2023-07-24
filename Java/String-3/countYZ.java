public int countYZ(String str) {
  int count = 0;
  if (str.length() > 0) {
    String[] Strings = str.split("\\d|\\W+"); // <-- inserting pipeline
    for (int i = 0; i < Strings.length; i++) {
      int len = Strings[i].length();
      if (len != 0) {
        if (Character.toLowerCase(Strings[i].charAt(len - 1)) == 'z') count++;
        else if (Character.toLowerCase(Strings[i].charAt(len - 1)) == 'y') count++;
      }
    }
  }
  return count;
}
