public int[] squareUp(int n) {
  int[] res = new int[n * n];
  int idx = 0;
  
  for (int i = 1; i < n + 1; i++) {
      for (int j = 0; j < n - i; j++) {
        res[idx] = 0;
        idx++;
      }
    
      for (int j = i; j > 0; j--) {
        res[idx] = j;
        idx++;
      }
  }
  return res;
}
