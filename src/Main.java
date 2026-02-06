public class Main
{
    public static void main(String[] args) {
        /*
        A program that starts with a credit card balance of $5000
        and then calculates the interest at a rate of 17%.
        Assume the user does not make any payments. Display
        the interest due after one month and again after two months.
         */

        int Balence = 5000;
        System.out.println("Inital Balence is " + Balence);

        double Intrest = 0.17;
        System.out.println("Intrest is " + "17%");

        double FirstMonthIntrest = Balence * Intrest;

        Balence += FirstMonthIntrest;
        System.out.println("Balence is after one month " + Balence);

        double SecondMonthIntrest = Balence * Intrest;
        Balence += SecondMonthIntrest;
        System.out.println("Balence is after two months" + Balence);


    }

}