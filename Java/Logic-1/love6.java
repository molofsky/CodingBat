public boolean love6(int a, int b) {
  if (a == 6 || b == 6 || b + a == 6 || Math.abs(b - a) == 6) return true;
  return false;
}
