public String middleTwo(String str) {
  int half = str.length()/2;
  return str.substring(half - 1, half) + str.substring(half, half + 1);
}
