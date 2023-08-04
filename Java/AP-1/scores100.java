public boolean scores100(int[] scores) {
  for (int i = 1; i < scores.length; i++) {
    if (scores[i - 1] == 100 && scores[i - 1] == scores[i]) {
      return true;
    }
  }
  return false;
}
