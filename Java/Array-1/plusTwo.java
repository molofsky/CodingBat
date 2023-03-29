public int[] plusTwo(int[] a, int[] b) {
  int [] result = new int[a.length + b.length];
  for (int i = 0; i < a.length + b.length; i++) {
    if (i >= b.length) result[i] = b[i - a.length];
    else result[i] = a[i];
  }
  return result;
}
