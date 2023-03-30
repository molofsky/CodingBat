public String[] firstSwap(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for (int i = 0; i < strings.length; i++) {
    if (!strings[i].equals("")) {
      String cur = String.valueOf(strings[i].charAt(0));
      if (map.get(cur) != null) {
        if (map.get(cur) != -1) {
          String temp = strings[map.get(cur)];
          strings[map.get(cur)] = strings[i];
          strings[i] = temp;
          map.put(cur, -1);
        }
      } else {
        map.put(cur, i);
      }
    }
  }
  return strings;
}
