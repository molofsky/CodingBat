public boolean scoresClump(int[] scores) {
  for (int i = 2; i < scores.length; i++) {
    if (scores[i - 1] - scores[i - 2] <= 2 && scores[i - 1] - scores[i - 2] >= 0) {
      if (scores[i] - scores[i - 1] <= 2 && scores[i] - scores[i - 1] >= 0) {
        if (scores[i] - scores[i - 2] <= 2) return true;
      }
    }
  }
  return false;
}
