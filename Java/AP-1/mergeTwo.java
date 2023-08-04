public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] res = new String[n];
  int i = 0, j = 0, idx = 0;
  
  while (idx < n) {
      int comp = a[i].compareTo(b[j]);
      if (comp < 0) {
        res[idx++] = a[i++];
      } 
      if (comp > 0) {
        res[idx++] = b[j++];
      }
      
      if (comp == 0) {
        res[idx++] = a[i++];
        j++;
      }
  }
  
  return res;
}
