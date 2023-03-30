public List<Integer> noTeen(List<Integer> nums) {
  nums.removeIf(n -> 13 <= n && n <= 19);
  return nums;
}
