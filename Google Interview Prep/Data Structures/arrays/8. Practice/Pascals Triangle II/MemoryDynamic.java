class MemoryDynamic {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> row =
        new ArrayList<>(rowIndex + 1) {
          {
            add(1);
          }
        };

    for (int i = 0; i < rowIndex; i++) {
      for (int j = i; j > 0; j--) {
        row.set(j, row.get(j) + row.get(j - 1));
      }
      row.add(1);
    }

    return row;
  }
}
