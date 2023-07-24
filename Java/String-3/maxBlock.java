public int maxBlock(String str) {
  int total = 0;
  int count = 0;
  
  if (str.length() > 0) {
    char cur = str.charAt(0);
    count++;
    
    for (int i = 1; i < str.length(); i++) {
      if (cur == str.charAt(i)) {
        count++;
      } else {
        cur = str.charAt(i);
        total = Math.max(count, total);
        count = 1;
      }
    }
    return Math.max(total, count);
  } else {
    return 0;
  }
}
