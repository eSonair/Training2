package Training2.FirstBadVersion;
/*

https://leetcode.com/problems/first-bad-version/description/


You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.


Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
Example 2:

Input: n = 1, bad = 1
Output: 1

Constraints:
1 <= bad <= n <= 231 - 1
 */


public class FirstBadVersion1 {

    public static void main(String[] args) {

        FirstBadVersion1 f1 = new FirstBadVersion1();

        System.out.println(f1.firstBadVersion(10));

    }//Ende Methode Main

    public int firstBadVersion(int n) {
            int low = 1;
            int high = n;

            while (low <= high) {
                int mid = (high - low) + low / 2; // Avoid potential overflow

                if (isBadVersion(mid)) {
                    high = mid - 1; // Set high to mid - 1 to search in the left half
                } else {
                    low = mid + 1; // Set low to mid + 1 to search in the right half
                }
            }
            return low;
    }//Ende Methode firstBadVersion


    public boolean isBadVersion (int n){
        if(n<4){
            return false;
        }else
            return true;
    }//Ende Methode isBadVersion.
}//Ende Klasse FirstBadVersion
