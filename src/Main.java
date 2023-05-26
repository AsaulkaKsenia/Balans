public class Main {
    public static void main(String[] args) {

        int account = - 100;
        int payment = 1100;
        int prize = 100; // рублей дают 1 бонусный рубль

        int bonus;
        if (payment > 1000) {
            bonus = payment / prize;
        } else {
            bonus = 0;
        }

        System.out.println("Количество бонусных рублей состаляет " + bonus);
        System.out.println("Итоговая сумма на счету " + (bonus + account + payment) + " рублей");


    }
}