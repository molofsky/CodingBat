public int sumLimit(int a, int b) {
  int sum = a + b;
  String digit = String.valueOf(sum);
  if (digit.length() == String.valueOf(a).length()) return sum;
  return a;
}
