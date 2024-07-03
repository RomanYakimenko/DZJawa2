public class Main {
    public static void main(String[] args) {
        int a = 5000;
        int b = 9000;
        int c = b / 100;

        int resault;
        if (b < 1000) {
            resault = a + b;
        } else {
            resault = a + b + c;
        }
            System.out.println("Сумма на счете: " + resault + " рублей ");


    }
}