public String atFirst(String str) {
  switch(str.length()) {
    case(1): 
        return str + '@';
    case(0):
        return "@@";
    default:
        return str.substring(0, 2);
  }
}
