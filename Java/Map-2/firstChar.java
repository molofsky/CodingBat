public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap();
  for (int i = 0; i < strings.length; i++) {
    String first = String.valueOf(strings[i].charAt(0));
    if (map.get(first) != null) map.put(first, map.get(first) + strings[i]);
    else map.put(first, strings[i]);
  }
  return map;
}
