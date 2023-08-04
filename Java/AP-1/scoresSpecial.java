public int scoresSpecial(int[] a, int[] b) {
  int max_a = 0;
  int max_b = 0;
  
  for (int i = 0; i < a.length; i++) {
    if(a[i] % 10 == 0) max_a = Math.max(max_a, a[i]);
  }
  
  for (int j = 0; j < b.length; j++) {
    if(b[j] % 10 == 0) max_b = Math.max(max_b, b[j]);
  }
  
  return max_a + max_b;
}
