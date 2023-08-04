public int sumHeights2(int[] heights, int start, int end) {
  int alt = 0, sum = 0;
  for (int i = start + 1; i < end + 1; i++) {
    sum = heights[i] - heights[i - 1];
    if (sum > 0) alt += sum * 2;
    else alt += Math.abs(sum);
  }
  return alt;
}
