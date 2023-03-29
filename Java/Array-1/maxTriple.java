public int maxTriple(int[] nums) {
    int max = nums[0];
    int check = nums[nums.length/2] > nums[nums.length - 1]  ? 
      nums[nums.length/2] : nums[nums.length - 1];
    return max > check ? max : check;
}
