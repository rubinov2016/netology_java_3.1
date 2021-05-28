import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        float ticketPrice;      //для хранения стоимости билета
        float bonusRate;        //для хранения количества рублей для одной бонусной милли
        long bonusMile = 0;     //итоговое количество бонусных милль
        bonusRate = 20F;
        ticketPrice = 134.56F;
        bonusMile = (long) (ticketPrice / bonusRate);
        System.out.println(bonusMile);

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}

