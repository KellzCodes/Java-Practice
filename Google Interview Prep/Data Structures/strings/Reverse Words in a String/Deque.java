class Deque {
  public String reverseWords(String s) {
    int left = 0, right = s.length() - 1;
    // remove leading spaces
    while (left <= right && s.charAt(left) == ' ') ++left;

    // remove trailing spaces
    while (left <= right && s.charAt(right) == ' ') --right;

    Deque<String> d = new ArrayDeque();
    StringBuilder word = new StringBuilder();
    // push word by word in front of deque
    while (left <= right) {
      char c = s.charAt(left);

      if ((word.length() != 0) && (c == ' ')) {
        d.offerFirst(word.toString());
        word.setLength(0);
      } else if (c != ' ') {
        word.append(c);
      }
      ++left;
    }
    d.offerFirst(word.toString());

    return String.join(" ", d);
  }
}
