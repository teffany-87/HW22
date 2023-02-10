public class Main {
    public static void main(String[] args) {
        int startBalance = 50;
        int addition = 1001;
        int bonus = 0;

        if (addition > 1000) {
            bonus = addition / 100;
        }
        int totalBalanceWithBonus = startBalance + addition + bonus;

        System.out.println("Итоговый счет " + totalBalanceWithBonus);
        System.out.println("Итоговый бонус " + bonus);


    }
}
