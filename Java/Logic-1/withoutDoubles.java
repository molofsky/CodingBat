public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  int sum = 0;
  if (!noDoubles) sum = die1 + die2;
  if (noDoubles) {
    if (die1 == die2) {
      if (die1 == 6) sum += 1 + die2;
      if (die1 != 6 && die2 == 6) sum += 1 + die1;
      else if (die1 != 6) sum += die1 + die2 + 1;
    } else {
      sum = die1 + die2;
    }
  }
  return sum;
}
