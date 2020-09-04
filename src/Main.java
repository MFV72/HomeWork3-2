public class Main {
    public static void main(String[] args) {
        int minimumLimit = 1000;
        int payment = 1100;
        int bonus;
        int count = 100; //1 рубль бонуса за 100 переведенных
        if (payment > minimumLimit) {
            bonus = payment / count;
        } else {
            bonus = 0;
        }
        int balance = 100;
        balance += payment + bonus;
        System.out.println(balance);
        System.out.println(bonus);
    }
}
