public int[] biggerTwo(int[] a, int[] b) {
  int a_count = 0, b_count = 0;
  for (int i = 0; i < a.length; i++) {
    a_count += a[i];
    b_count += b[i];
  }
  return a_count >= b_count ? a  : b;
}
