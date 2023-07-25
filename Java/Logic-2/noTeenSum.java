public int noTeenSum(int a, int b, int c) {
  return fixTeen(a) + fixTeen(b) + fixTeen(c);
}

public int fixTeen(int n) {
  if (n != 15 && n != 16 && n > 12 && n < 20) return 0;
  return n;
}
