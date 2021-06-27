# Pascal's Triangle II

Given an integer ```rowIndex```, return the rowIndex<sup>th</sup> (**0-indexed**) row of the **Pascal's triangle**.

In **Pascal's triangle**, each number is the sum of the two numbers directly above it as shown:

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/PascalTriangleAnimated2.gif" alt="pascals_triangle" width="300"/>
> In Pascal's triangle, each number is the sum of the two numbers directly above it.

![image](https://user-images.githubusercontent.com/19383145/123534581-2a958500-d6ec-11eb-919c-75e5d29186ce.png)

## Solution

### Approach 1: Brute Force Recursion

**Algorithm**

![image](https://user-images.githubusercontent.com/19383145/123534595-44cf6300-d6ec-11eb-9ef1-d79dee2dacea.png)

```
class Solution {
  private int getNum(int row, int col) {
    if (row == 0 || col == 0 || row == col) {
      return 1;
    }

    return getNum(row - 1, col - 1) + getNum(row - 1, col);
  }

  public List<Integer> getRow(int rowIndex) {
    List<Integer> ans = new ArrayList<>();

    for (int i = 0; i <= rowIndex; i++) {
      ans.add(getNum(rowIndex, i));
    }

    return ans;
  }
}
```

**Complexity Analysis**

![image](https://user-images.githubusercontent.com/19383145/123534618-616b9b00-d6ec-11eb-8b89-388d18558632.png)

### Approach 2: Dynamic Programming

**Intuition**

In the previous approach, we end up making the same recursive calls repeatedly.

![image](https://user-images.githubusercontent.com/19383145/123534632-73e5d480-d6ec-11eb-90ef-9b086868b1db.png)

For example, to calculate ```getNum(5, 3)``` and ```getNum(5, 4)```, we end up calling ```getNum(3, 2)``` thrice. To generate, the entire fifth row (```0```-based row indexing), we'd have to call ```getNum(3, 2)``` four times.

It makes sense to store the results of intermediate recursive calls for later use.

**Algorithm**

Simple memoization caches results of deep recursive calls and provides significant savings on runtime.

```
class Solution {
  private final class RowCol {
    private int row, col;

    public RowCol(int row, int col) {
      this.row = row;
      this.col = col;
    }

    @Override
    public int hashCode() {
      int result = (int) (row ^ (row >>> 32));
      return (result << 5) - 1 + (int) (col ^ (col >>> 32)); // 31 * result == (result << 5) - 1
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null) return false;
      if (this.getClass() != o.getClass()) return false;

      RowCol rowCol = (RowCol) o;
      return row == rowCol.row && col == rowCol.col;
    }
  }

  private Map<RowCol, Integer> cache = new HashMap<>();

  private int getNum(int row, int col) {
    RowCol rowCol = new RowCol(row, col);

    if (cache.containsKey(rowCol)) {
      return cache.get(rowCol);
    }

    int computedVal =
        (row == 0 || col == 0 || row == col) ? 1 : getNum(row - 1, col - 1) + getNum(row - 1, col);

    cache.put(rowCol, computedVal);

    return computedVal;
  }

  public List<Integer> getRow(int rowIndex) {
    List<Integer> ans = new ArrayList<>();

    for (int i = 0; i <= rowIndex; i++) {
      ans.add(getNum(rowIndex, i));
    }

    return ans;
  }
}
```

But, it is worth noting that generating a number for a particular row requires only two numbers from the previous row. Consequently, generating a row only requires numbers from the previous row.

Thus, we could reduce our memory footprint by only keeping the latest row generated, and use that to generate a new row.

```
class Solution {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> curr,
        prev =
            new ArrayList<>() {
              {
                add(1);
              }
            };

    for (int i = 1; i <= rowIndex; i++) {
      curr =
          new ArrayList<>(i + 1) {
            {
              add(1);
            }
          };

      for (int j = 1; j < i; j++) {
        curr.add(prev.get(j - 1) + prev.get(j));
      }

      curr.add(1);

      prev = curr;
    }

    return prev;
  }
}
```

**Complexity Analysis**

![image](https://user-images.githubusercontent.com/19383145/123534729-2c137d00-d6ed-11eb-80f8-27a107c00e38.png)

### Approach 3: Memory-efficient Dynamic Programming

**Intuition**

Notice that in the previous approach, we have maintained the previous row in memory on the premise that we need terms from it to build the current row. This is true, but not wholly.

What we actually need, to generate a term in the current row, is just the two terms above it (present in the previous row).

Formally, in memory,

```
pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j]
```

where ```pascal[i][j]``` is the number in i<sup>th</sup> row and j<sup>th</sup> column of Pascal's triangle.

So, trying to compute ```pascal[i][j]```, only the memory regions of ```pascal[i-1][j-1]``` and ```pascal[i-1][j]``` are required to be accessed.

**Algorithm**

![image](https://user-images.githubusercontent.com/19383145/123534805-b5c34a80-d6ed-11eb-8d0a-5556ec556027.png)

![image](https://user-images.githubusercontent.com/19383145/123534810-c07ddf80-d6ed-11eb-9dcb-9a804f2a479f.png)

![image](https://user-images.githubusercontent.com/19383145/123534813-c83d8400-d6ed-11eb-929b-1d783f3059c7.png)

```
class Solution {
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
```

**Complexity Analysis**

![image](https://user-images.githubusercontent.com/19383145/123534823-e99e7000-d6ed-11eb-8c6c-e0c2aea54eb9.png)

### Approach 4: Math! (specifically, Combinatorics)

**Intuition**

![image](https://user-images.githubusercontent.com/19383145/123534834-09359880-d6ee-11eb-90c1-b08852a4feb2.png)

Binomial coefficients have an additive property, known as [Pascal's rule](https://en.wikipedia.org/wiki/Pascal%27s_rule):

![image](https://user-images.githubusercontent.com/19383145/123534864-3d10be00-d6ee-11eb-900a-82e8c7a15e4e.png)

**Algorithm**

![image](https://user-images.githubusercontent.com/19383145/123534889-54e84200-d6ee-11eb-8e9b-ebdbade3f41b.png)

```
class Solution {
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
```

**Complexity Analysis**

![image](https://user-images.githubusercontent.com/19383145/123534903-6df0f300-d6ee-11eb-8e63-2a18c05837fe.png)

