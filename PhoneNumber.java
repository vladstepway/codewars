public class PhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0], numbers[1], numbers[2], numbers[3], numbers[4],
                numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static void main(String[] args) {
        System.out.println(PhoneNumber.createPhoneNumber(
                new int[]{6,2,6,8,2,2,4,8,2,1}));
    }

}
