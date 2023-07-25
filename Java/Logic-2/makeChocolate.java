public int makeChocolate(int small, int big, int goal) {
  int remainder = 0;
  
  if (goal >= big * 5) remainder = goal - 5 * big;
  else remainder = goal % 5;
  
  if (remainder <= small) return remainder;
  return -1;
}
