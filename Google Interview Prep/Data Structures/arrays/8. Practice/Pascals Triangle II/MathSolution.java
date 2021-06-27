class MathSolution {
  public List<Integer> getRow(int n) {
    List<Integer> row =
        new ArrayList<>() {
          {
            add(1);
          }
        };

    for (int k = 1; k <= n; k++) {
      row.add((int) ((row.get(row.size() - 1) * (long) (n - k + 1)) / k));
    }

    return row;
  }
}
