public class Main {
    public static void main(String[] args) {
        int doPOpolneniya = 5000;
        int summaPopolneniya = 9000;
        int kolichestvoBonusov = summaPopolneniya / 100;

        int resault;
        if (summaPopolneniya < 1000) {
            resault = doPOpolneniya + summaPopolneniya;
        } else {
            resault = doPOpolneniya + summaPopolneniya + kolichestvoBonusov;
        }
        System.out.println("Сумма на счете: " + resault + " рублей ");


    }
}