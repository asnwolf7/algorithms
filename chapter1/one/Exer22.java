/**
 * 二分查找法的迭代实现
 *
 * @Author: Beihai
 * @Create: 2023/3/26
 */

package chapter1.one;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class Exer22 {

    public static int indexOf(int[] a, int lo, int hi, int depth, int key) {
        System.out.printf("li:%d hi:%d depth:%d", lo, hi, depth);
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                System.out.printf(" %d < %d \n", key, a[mid]);
                hi = mid - 1;
            }
            else if (key > a[mid]) {
                System.out.printf("%d > %d \n", key, a[mid]);
                lo = mid + 1;
            }
            else {
                System.out.printf(" found key:%d, location:%d \n", key, mid);
                return mid;
            }
            return indexOf(a, lo, hi, depth + 1, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        System.out.printf(" allowList:" + whitelist + "\n");
        Arrays.sort(whitelist);
        System.out.printf(" sorted allowList:" + whitelist + "\n");
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (indexOf(whitelist, 0, whitelist.length, 1, key) == -1) {
                System.out.println(key);
            }

        }

    }
}
