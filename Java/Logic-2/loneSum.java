public int loneSum(int a, int b, int c) {
  if (a == b && b == c && a == c) return 0;
  if (a == b && b != c && a != c) return c;
  if (a != b && b != c && a == c) return b;
  if (a != b && b == c && a != c) return a;
  return a + b + c;
}
