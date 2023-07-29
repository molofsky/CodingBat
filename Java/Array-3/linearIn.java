public boolean linearIn(int[] outer, int[] inner) {
  int count = 0;
  for (int i = 0; i < inner.length; i++) { 
    for (int j = 0; j < outer.length; j++) {
      int cur = inner[i];
      if (cur == outer[j]) {
        count++;
        break;
      }
    }
  }
  return count == inner.length;
}
