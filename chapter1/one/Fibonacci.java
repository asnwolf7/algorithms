/**
 * 斐波那契函数
 *
 * @Author: Beihai
 * @Create: 2023/3/25
 */

package chapter1.one;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class Fibonacci {

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static void main(String[] args) {

        for (int N = 0; N < 100; N++) {
            Stopwatch stopwatch = new Stopwatch();
            StdOut.printf("%d %10d uses %.2f seconds\n", N, F(N), stopwatch.elapsedTime());
        }
    }
}
 