public int[] front11(int[] a, int[] b) {
  int [] result = new int[0];
  if (a.length >= 1) {
    result = new int[1];
    result[0] = a[0];
  }
  if (b.length >= 1) {
    if (a.length >= 1) {
      result = new int[2];
      result[0] = a[0];
      result[1] = b[0];
    } else {
      result = new int[1];
      result[0] = b[0];
    }
    
  }
  return result;
}
