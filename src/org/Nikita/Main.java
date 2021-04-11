package org.Nikita;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите день своего рождения");
            int day = scanner.nextInt();
            System.out.println("Введите месяць своего рождения");
            int month = scanner.nextInt();
            System.out.println("Введите год своего рождения");
            int years = scanner.nextInt();
            LocalDate birthday = LocalDate.of(years, month, day);
            Period period_18 = Period.between(birthday, LocalDate.now());
            if (period_18.getYears() >= 18) {
                System.out.println("Вам есть 18!");
            } else {
                System.out.println("Вам нет 18!");
            }
        } catch (DateTimeException exception) {
            System.out.println("Вы ввели неправильные данные");
            System.out.print(exception.getMessage());
        }
    }
}
