public int max1020(int a, int b) {
  if ((a >= 10 && a <= 20) && !(b >= 10 && b <= 20)) return a;
  if (!(a >= 10 && a <= 20) && (b >= 10 && b <= 20)) return b;
  if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
    if (a > b) return a;
    else return b;
  }
  return 0;
}
