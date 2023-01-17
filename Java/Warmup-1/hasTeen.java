public boolean hasTeen(int a, int b, int c) {
  return teen(a) || teen(b) || teen(c);
}

private boolean teen(int x) {
  return (x >= 13 && x <= 19);
}
