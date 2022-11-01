public class Strings {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //float
        //double
        //long
        //boolean
        //char

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2022";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString += "49.95";
        System.out.println(numberString);
    }
}