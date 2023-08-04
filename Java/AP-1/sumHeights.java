public int sumHeights(int[] heights, int start, int end) {
  int alt = 0;
  for (int i = start + 1; i < end + 1; i++) {
    alt += Math.abs(heights[i - 1] - heights[i]);
  }
  return alt;
}
