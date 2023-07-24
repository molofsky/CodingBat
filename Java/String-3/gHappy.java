public boolean gHappy(String str) {
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'g') {
      if (i - 1 >= 0) {
        if (i + 1 < str.length()) {
          if (str.charAt(i - 1) != 'g' 
              && str.charAt(i + 1) != 'g') return false;
        } else {
          if (str.charAt(i - 1) != 'g') return false;
        }
      } else if (i + 1 < str.length()) {
        if (str.charAt(i + 1) != 'g') return false;
      } else {
        return false;
      }
      
    }
  }
  return true;
}
