public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte num = 10;
        short num2 = 20;
        int num3 = 50;
        long num4 = 50000L + 10L * (num + num2 + num3);
        System.out.println(num4);
    }
}