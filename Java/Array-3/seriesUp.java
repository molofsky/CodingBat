public int[] seriesUp(int n) {
  int[] result = new int[n * (n + 1)/2];
  int idx = 0;
  
  for (int i = 1; i < n + 1; i++) {
    for (int j = 1; j < i + 1; j++) {
        result[idx] = j;
        idx++;
    }
  }
  return result;
}
