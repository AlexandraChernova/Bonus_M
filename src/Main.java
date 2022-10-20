public class Main {
    public static void main(String[] args) {
        int fee = 1200;
        int bonus = fee/100;
        int mobileBalance = fee + bonus;

        if (fee > 1000) {
            System.out.println("Количество начисленных бонусов "+bonus);
            System.out.println("Ваш баланс " + mobileBalance);
        } else {
            System.out.println("Ваш баланс " + fee);
        }
    }
}