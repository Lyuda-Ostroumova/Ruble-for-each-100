import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int initialAccount;
        int sumAdded;
        int newSum;
        int bonus;

        initialAccount = ;
        sumAdded = ;

        if (sumAdded > 1000) {
            bonus = sumAdded / 100;
            newSum = initialAccount + sumAdded + bonus;
        } else {
            bonus = 0;
            newSum = initialAccount + sumAdded;
        }

        System.out.println("Итоговый счет:" + newSum);
        System.out.println("Бонусные рубли:" + bonus);

        }



    }

