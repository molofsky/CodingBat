public String wordAppend(String[] strings) {
  String result = "";
  Map<String, Integer> map = new HashMap();
  for (int i = 0; i < strings.length; i++) {
    if (map.get(strings[i]) != null) {
      if (map.get(strings[i]) % 2 == 1) result += strings[i];
      map.put(strings[i], map.get(strings[i]) + 1);
    } else {
      map.put(strings[i], 1);
    }
  }
  return result;
}
