import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int initialAccount;
        int sumAdded;
        int newSum;
        int bonus;

        initialAccount = 150;
        sumAdded = 1550;

        if (sumAdded > 1000) {
            bonus = sumAdded / 100;
        } else {
            bonus = 0;
        }

        newSum = initialAccount + sumAdded + bonus;

        System.out.println("Итоговый счет:" + newSum);
        System.out.println("Бонусные рубли:" + bonus);

        }



    }

