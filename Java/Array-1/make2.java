public int[] make2(int[] a, int[] b) {
  int []result = new int[2];
  for (int i = 0; i < a.length + b.length; i++) {
    if (i == 2) break;
    if (i >= a.length) result[i] = b[i - a.length];
    else result[i] = a[i];
  }
  return result;
}
