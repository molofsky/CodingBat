public boolean catDog(String str) {
  int c_count = 0, d_count = 0;
  for (int i = 0; i < str.length() - 2; i++) {
    if (str.substring(i, i + 3).equals("cat")) c_count++;
    if (str.substring(i, i + 3).equals("dog")) d_count++;
  }
  return c_count == d_count;
}
