/**
 * 斐波那契函数
 *
 * @Author: Beihai
 * @Create: 2023/3/25
 */

package chapter1.one;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class Fibonacci1 {
    public static void main(String[] args) {

        Stopwatch stopwatch = new Stopwatch();
        double[] arr = new double[1000];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < 1000; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        for (int i = 0; i < 1000; i++) {
            StdOut.printf("%d  %.0f \n", i, arr[i]);
        }
        StdOut.printf("use %.2f seconds \n", stopwatch.elapsedTime());
    }
}
 