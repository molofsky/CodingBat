public String minCat(String a, String b) {
  int a_len = a.length();
  int b_len = b.length();
  if (a_len > b_len) return a.substring(a_len - b_len, a_len) + b;
  if (a_len < b_len) return a + b.substring(b_len - a_len, b_len); 
  return a + b;
}
