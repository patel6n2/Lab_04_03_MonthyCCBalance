public class Main
{
    public static void main(String[] args)
    {
        double firstMonthInterest = 0;
        double secondMonthInterest = 0;
        double balance = 5000;
        firstMonthInterest = 0.17 * balance;
        secondMonthInterest = 0.17 * (balance + firstMonthInterest);
        System.out.println("The interest due after 1 month is " + firstMonthInterest);
        System.out.println("The interest due after 2 months is " + secondMonthInterest);
    }
}