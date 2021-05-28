# Check If N and Its Double Exist

## Given an array ```arr``` of integers, check if there exists two integers ```N``` and ```M``` such that ```N``` is the double of ```M``` ( i.e. ```N = 2 * M```).

More formally check if there exists two indices ```i``` and ```j``` such that :

- ```i != j```
- ```0 <= i, j < arr.length```
- ```arr[i] == 2 * arr[j]```

#### Example 1:

**Input**: ```arr = [10,2,5,3]```

**Output**: ```true```

**Explanation**: ```N = 10``` is the double of ```M = 5```, that is, ```10 = 2 * 5```.

#### Example 2:

**Input**: ```arr = [7,1,14,11]```

**Output**: ```true```

**Explanation**: ```N = 14``` is the double of ```M = 7```, that is, ```14 = 2 * 7```.

#### Example 3:

**Input**: ```arr = [3,1,7,11]```

**Output**: ```false```

**Explanation**: In this case does not exist ```N``` and ```M```, such that ```N = 2 * M```

#### Constraints:

- ```2 <= arr.length <= 500```
- ```-10^3 <= arr[i] <= 10^3```

#### Hints

- Loop from ```i = 0``` to ```arr.length```, maintaining in a hashTable the array elements from ```[0, i - 1]```.
- On each step of the loop check if we have seen the element ```2 * arr[i]``` so far or ```arr[i] / 2``` was seen if ```arr[i] % 2 == 0```.

## Solution

HashSet provides *O(1)* lookup, so it is ideal for this question. For each number in the array we check, if we have already seen it's half or it's double.

**NOTE**: When checking half, we need to ensure that the current number is even, or else we will get wrong anwer like in the case of 3 and 7 being in the input. Here for 7, 7/2 would give 3 (not 3.5) which is present in the HashSet but not what we need.

```
public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();   
        for (int i : arr) {
            // if i is half or 2 times of a number in seen
            if (seen.contains(2 * i) || i % 2 == 0 && seen.contains(i / 2))
                return true;
            seen.add(i);
        }
        return false;
}
```

