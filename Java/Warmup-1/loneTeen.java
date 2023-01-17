public boolean loneTeen(int a, int b) {
  return (teen(a) && !teen(b)) || (!teen(a) && teen(b));
}

private boolean teen(int x) {
  return (x >= 13 && x <= 19);
}
