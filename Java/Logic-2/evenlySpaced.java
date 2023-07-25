public boolean evenlySpaced(int a, int b, int c) {
  if (a > b && a < c || a < b && a > c) return Math.abs(a - b) == Math.abs(a - c);
  if (b > a && b < c || b < a && b > c) return Math.abs(b - a) == Math.abs(b - c);
  if (c > a && c < b || c < a && c > b) return Math.abs(c - a) == Math.abs(c - b);
  return (a == b && b == c && a == c);
}
