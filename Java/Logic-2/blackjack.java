public int blackjack(int a, int b) {
   if (a > 21 && b > 21) return 0;
   if (b > 21) return a;
   if (a > 21) return b;
   return a > b ? a : b;
}
