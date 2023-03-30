public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap();
  for (int i = 0; i < strings.length; i++) {
    String cur = strings[i];
    if (map.get(cur) != null) map.put(cur, true);
    else map.put(cur, false);
  }
  return map;
}
