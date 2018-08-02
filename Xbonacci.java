import java.util.Arrays;

/**
 * This program calculate sequance of numbers,similar to fibonacci
 */

public class Xbonacci {
    /**
     * @param signature signature of xbonacci sequence
     *                  example - sequence {0,1},thats why it
     *                  will be sequence of numbers like X member
     *                  equals to sum of two previous members
     * @param num       its a number of xbonacci sequence's members
     * @return result array with whole sequence of Xbonacci numbers
     */


    public double[] xbonacci(double[] signature, int num) {

        double[] result = new double[num];

        for (int i = 0; i < num; i++) {
            if (i < signature.length) {
                result[i] = signature[i];
            } else {
                for (int j = 1; j <= signature.length; j++) {
                    result[i] += result[i - j];
                }
            }
        }
        return result;
    }
}

/**
 * testing xbonacci sequence
 */
class Test {
    public static void main(String[] args) {
        Xbonacci xbonacci = new Xbonacci();
        System.out.println(Arrays.toString(
                xbonacci.xbonacci(new double[]{0, 1}, 10)));
        System.out.println(Arrays.toString(
                xbonacci.xbonacci(new double[]{0, 0,0,0,1}, 10)));
    }
}
