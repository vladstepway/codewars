import java.util.Arrays;

public class Xbonacci {
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

class Test {
    public static void main(String[] args) {
        Xbonacci xbonacci = new Xbonacci();
        System.out.println(Arrays.toString(xbonacci.xbonacci(new double[]{0, 1}, 10)));
    }
}
