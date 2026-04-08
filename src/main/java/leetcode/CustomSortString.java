class CustomSortString {
  public String CustomSortString(String order, String s) {
    StringBuilder sb  = new StringBuilder();
    int[] count = new int[128];

    for (final char c: s.toCharArray()) {
      ++count[c];
    }

    for(final char c: order.toCharArray()) {
      while(count[c]-- > 0)
      sb.append(c);
    }

    for(char c = 'a'; c<='z'; ++c) {
      while(count[c] -- >0) {
        sb.append(c);
      }
    }

    return order;
  }
}