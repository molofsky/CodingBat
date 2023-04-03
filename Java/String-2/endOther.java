public boolean endOther(String a, String b) {
  int a_len = a.length();
  int b_len = b.length();
  if (a_len >= b_len) {
    if ((a.substring(a_len - b_len, a_len).toLowerCase()).equals(b.toLowerCase())) 
    return true;
  } else {
    if ((b.substring(b_len - a_len, b_len).toLowerCase()).equals(a.toLowerCase())) 
    return true;
  }
  return false;
}
