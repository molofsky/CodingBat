public int scoresAverage(int[] scores) {
  int avg1 = average(scores, 0, scores.length/2);
  int avg2 = average(scores, scores.length/2, scores.length);
  return Math.max(avg1, avg2);
}

public int average(int[] scores, int start, int end) {
  int result = 0;
  for (int i = start; i < end; i++) {
    result += scores[i];
  }
  return result/(end - start); 
}
