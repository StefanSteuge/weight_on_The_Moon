package com.cursor;

public class Main {

    public static void main(String[] args) {
      /*
	9. Сила тяжести на Луне составляет около 17% земной. Напишите программу,
	 которая вычислила бы ваш вес на Луне.
	 */

        double weight_on_The_Earth = 60;
        double weight_on_The_Moon = weight_on_The_Earth * 17 / 100;
        System.out.println(weight_on_The_Moon);

        /*
    10. Видоизмените программу, созданную в упражнении 1.2, таким образом,
    чтобы она выводила таблицу перевода дюймов в метры. Выведите значения
    длины до 12 футов через каждый дюйм. После каждых 12 дюймов выведите
    пустую строку. (Один метр приблизительно равен 39,37 дюйма. )
	 */
        double inch;
        double meter;
        int count;

        count = 0;
        for (inch = 1; inch < 145; inch++) {
            meter = inch / 39.37;
            count++;
            System.out.println("В " + inch + " дюймі є " + meter + " метрів");
            if (count == 12) {
                System.out.println();
                count = 0;

            }
        }
    }
}
