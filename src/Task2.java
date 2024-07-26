public class Task2 {
    public static void main(String[] args){
        int initialAccount = 100;
        int replenishment = 1100;

        int bonus;
        //здесь некорректно дано задание:
        //изначально есть условие, что только от пополнения зависит, будут бонусы или нет
        // *(если клиент пополняет счёт более чем на 1000 рублей, )
        // далее написано, что
        // "при замене значений переменных — начальной суммы счёта и суммы пополнения
        // — итоговый счёт и бонусные рубли рассчитывались правильно"
        //это можно оценивать двояко, но, надеюсь, я правильно поняла условие задания.

        if (replenishment >= 1000)  {
            bonus = replenishment / 100;
            System.out.println("Бонус равен " + bonus + " руб.");
            System.out.println("Итоговая сумма на счету " + (replenishment + initialAccount + bonus) + " руб.");
        }
        else {
            System.out.println("Бонусов нет, итоговая сумма на счету " + (replenishment + initialAccount) + " руб.");
        }
    }
}
