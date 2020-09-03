public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int minimumLimit = 1000;
        int payment;
        int bonus;
        int count;
        count = 100; //1 рубль бонуса за 100 переведенных
        payment = 1100;
        if (payment > minimumLimit) {
            bonus = payment / count;
        } else {
            bonus = 0;
        }
        balance = balance + payment + bonus;
        System.out.println(balance);
        System.out.println(bonus);
    }
}
