public boolean closeFar(int a, int b, int c) {
  if (Math.abs(a - b) <= 1) {
    return Math.abs(a - c) > 1 && Math.abs(b - c) > 1;
  }
  if (Math.abs(b - c) <= 1) {
    return Math.abs(a - c) > 1 && Math.abs(c - b) > 1;
  }
  if (Math.abs(a - c) <= 1) {
    return Math.abs(a - b) > 1 && Math.abs(c - b) > 1;
  }
  return false;
}
