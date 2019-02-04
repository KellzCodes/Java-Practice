package repeatedStringMatch;

/*
* Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it.
* If no such solution, return -1.
*
* For example, with A = "abcd" and B = "cdabcdab".
* Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of
* A repeated two times ("abcdabcd").
*
* Note:
* The length of A and B will be between 1 and 10000.
* */

public class Main {
    public static void main (String[] args){
        String a = "abcd";
        String b = "cdabcdababcd";
        Solution1 solution1 = new Solution1();
        int solve1 = solution1.repeatedStringMatch1(a, b);
        System.out.println(solve1);

        Solution2 solution2 = new Solution2();
        int solve2 = solution2.repeatedStringMatch2(a, b);
        System.out.println(solve2);
    }
}
