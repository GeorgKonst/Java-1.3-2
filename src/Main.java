import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int scoreClient = 100_00; // начальная сумма на счете

        System.out.println("На какую суммы вы хотите пополнить счет?");
        float refillRub = in.nextFloat()*100; //пополнение клиентом в рублях

        int refillCop = (int) refillRub; //Пополнение в копейках
        int bonus = 0;
        if (refillCop >= 1000_00) {
            bonus = refillCop/10000;  //Бонус в рублях
        }
        System.out.println("Количество начислившихся бонусов: "+bonus); //Итоговое число бонусов
        int newScoreClient = scoreClient + refillCop + bonus*100; //Счет(коп) + пополнение(коп) + бонус(коп)

        System.out.println("Итоговая сумма на Вашем счете:  " + newScoreClient/100 + " рублей, " + newScoreClient%100 + " копеек.");
    }
}
