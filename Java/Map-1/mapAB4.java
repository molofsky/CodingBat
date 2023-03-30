public Map<String, String> mapAB4(Map<String, String> map) {
  if (map.get("a") != null && map.get("b") != null) {
    String max = (map.get("a").length() == map.get("b").length()) ?
          "" : (map.get("a").length() > map.get("b").length() ? 
              map.get("a") : map.get("b"));
    if (max.equals("")) {
      map.put("a", max);
      map.put("b", max);
    } else {
      map.put("c", max);
    }
  }
  return map;
}
