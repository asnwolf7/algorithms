/**
 * 练习1.1.21
 *
 * @Author: Beihai
 * @Create: 2023/3/26
 */

package chapter1.one;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exer21 {
    public static void main(String[] args) {

        while (StdIn.hasNextLine()) {
            String name = StdIn.readString();
            int num1 = StdIn.readInt();
            int num2 = StdIn.readInt();
            double f = num2 * 1.0 / num1;
            StdOut.printf("name:%s balls:%d hits:%d ratio:%.3f \n", name, num1, num2, f);

        }
    }
}
