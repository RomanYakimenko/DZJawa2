public class Main {
    public static void main(String[] args) {
        int underReplenishment = 5000;
        int amountReplenishment = 9000;
        int bonus = amountReplenishment / 100;

        int resault;
        if (amountReplenishment < 1000) {
            resault = underReplenishment + amountReplenishment;
        } else {
            resault = underReplenishment + amountReplenishment + bonus;
        }
        System.out.println("Сумма на счете: " + resault + " рублей ");


    }
}