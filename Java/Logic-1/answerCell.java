public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if (isAsleep) return false;
  if (isMorning && isMom) return true;
  if (!isMorning) return true;
  return false;
}
