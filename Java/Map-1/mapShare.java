public Map<String, String> mapShare(Map<String, String> map) {
  if (map.get("a") != null) {
    map.put("b", map.get("a"));
  }
  map.remove("c");
  return map;
}
