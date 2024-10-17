public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------Задание №1---------------------");
        float amountAcumulation = 0f;
        float contribution = 15000f;
        short numberMonths = 0;
        float amountThreshold = 2459000f;
        while (amountAcumulation <= amountThreshold) {
            amountAcumulation = amountAcumulation + contribution;
            numberMonths++;
        }
        System.out.println("При откладывании по " + contribution + " рублей в месяц, накопить сумму " + amountThreshold + " руб. можно за:");
        System.out.println("месяц " + numberMonths + ", сумма накоплений равна " + amountAcumulation + " рублей");

        System.out.println("\n----------------------Задание №2---------------------");
        byte number = 1;
        while (number <= 10) {
            System.out.print((number++) + " ");
        }
        number--;
        System.out.println("");
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }

        System.out.println("\n\n----------------------Задание №3---------------------");
        int population = 12_000_000;
        byte birthRate = 17;
        byte mortalityRate = 8;
        for (short year = 2024; year <= 2034; year++) {
            int birthPopulation = (int) (population / 1000f * birthRate);
            int mortalityPopulation = (int) (population / 1000f * mortalityRate);
            population = population + birthPopulation - mortalityPopulation;
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек;");
        }

        System.out.println("\n----------------------Задание №4---------------------");
        contribution = 15000f;
        amountAcumulation = 0f;
        byte percent = 7;
        short month = 0;
        amountThreshold = 12_000_000f;
        while (amountAcumulation <= amountThreshold) {
            amountAcumulation = (amountAcumulation + contribution) + ((amountAcumulation + contribution) * percent / 100);
            month++;
            System.out.print("Сумма накопления на конец " + month + " месяца равна: ");
            System.out.printf("%.2f%s\n", amountAcumulation, " рубля");
        }
        System.out.print("Василию прийдется копить сумму  ");
        System.out.printf("%.2f", amountThreshold);
        System.out.print(" рублей в течении " + (month) + " месяцев и на начало " + (month + 1) + " месяца он может снять сумму в размере ");
        System.out.printf("%.2f%s\n", amountAcumulation, " рубля");

        System.out.println("\n----------------------Задание №5---------------------");
        contribution = 15000f;
        amountAcumulation = 0f;
        percent = 7;
        month = 0;
        amountThreshold = 12_000_000f;
        while (amountAcumulation <= amountThreshold) {
            amountAcumulation = (amountAcumulation + contribution) + ((amountAcumulation + contribution) * percent / 100);
            month++;
            if (month % 6 == 0) {
                System.out.print("Сумма накопления на конец " + month + " месяца равна: ");
                System.out.printf("%.2f%s\n", amountAcumulation, " рубля");
            }
        }
        System.out.print("Василию прийдется копить сумму  ");
        System.out.printf("%.2f", amountThreshold);
        System.out.print(" рублей в течении " + month + " месяцев и на начало " + (month + 1) + " месяца он может снять сумму в размере ");
        System.out.printf("%.2f%s\n", amountAcumulation, " рубля");

        System.out.println("\n----------------------Задание №6---------------------");
        contribution = 15000f;
        amountAcumulation = 0f;
        percent = 7;
        byte yearsAccumulation = 9;
        short monthAccumulation = (short) (yearsAccumulation * 12);
        for (month = 1; month <= monthAccumulation; month++) {
            amountAcumulation = (amountAcumulation + contribution) + ((amountAcumulation + contribution) * percent / 100);
            if (month % 6 == 0) {
                System.out.print("Сумма накопления на конец " + month + " месяца равна: ");
                System.out.printf("%.2f%s\n", amountAcumulation, " рубля");
            }
        }
        System.out.print("Итого за " + yearsAccumulation + " лет, Василий сможет накопить сумму в размере");
        System.out.printf("%.2f%s\n", amountAcumulation, " рубля");
        System.out.println("\n----------------------Задание №7---------------------");
        byte numberFriday = 7;
        if (numberFriday > 7) {
            System.out.println("Ошибка введите число первой пятницы в месяце");
        } else {
            for (number = 1; number <= 31; number++) {
                if ((numberFriday - number) % 7 == 0) {
                    System.out.println("Сегодня пятница, " + number + "-е число. Необходимо подготовить отчет");
                }
            }
        }

        System.out.println("\n----------------------Задание №8---------------------");
        short yearBefore200 = 2024 - 200;
        short yearAfter100 = 2024 + 100;
        System.out.println("Года пролета над землей комметы:");
        for (short year = yearBefore200; year < yearAfter100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}