public boolean equalIsNot(String str) {
  int i = str.indexOf("is"), j = str.indexOf("not");
  int iCount = 0, jCount = 0;
  while (i != -1) {
    iCount++;
    i = str.indexOf("is", i + 1);
  }
  while (j != -1) {
    jCount++;
    j = str.indexOf("not", j + 1);
  }
  return iCount == jCount;
}
