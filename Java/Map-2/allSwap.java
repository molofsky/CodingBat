public String[] allSwap(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for (int i = 0; i < strings.length; i++) {
    if (!strings[i].equals("")) {
      String cur = String.valueOf(strings[i].charAt(0));
      if (map.get(cur) != null) {
        String temp = strings[map.get(cur)];
        strings[map.get(cur)] = strings[i];
        strings[i] = temp;
        map.remove(cur);
      } else {
        map.put(cur, i);
      }
    }
  }
  return strings;
}
