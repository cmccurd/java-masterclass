public class OperatorsChallenge {
    public static void main(String[] args) {
        double myDoubleVariable = 20.00;
        double myDoubleVariable2 = 80.00;
        double total = (myDoubleVariable + myDoubleVariable2) * 100.00;
        double remainder = total % 40.00;
        boolean result = remainder == 0 ? true : false;
        System.out.println(result);
        if (!result) {
            System.out.println("Got some remainder");
        }
        
    }
}