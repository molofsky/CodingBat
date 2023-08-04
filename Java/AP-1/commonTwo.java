public int commonTwo(String[] a, String[] b) {
  int i = 0, j = 0, count = 0;
  
  while (i < a.length && j < b.length) {
      int comp = a[i].compareTo(b[j]);
      if (comp < 0) {
        i++;
      }
      if (comp > 0) {
        j++;
      }
      if (comp == 0) {
        count++;
        String val = a[i];
        while (i < a.length && a[i] == val) i++;
        while (j < b.length && b[j] == val) j++;
      }
  }
  return count;
}
