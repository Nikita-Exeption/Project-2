package org.Nikita;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите день своего рождения");
            int dr = scanner.nextInt();
            System.out.println("Введите месяць своего рождения");
            int m = scanner.nextInt();
            System.out.println("Введите год своего рождения");
            int y = scanner.nextInt();
            LocalDate localDate = LocalDate.now().minusYears(18);
            LocalDate localDate1 = LocalDate.of(y,m,dr);
            if (localDate1.isBefore(localDate)) {
                System.out.println("Вам есть 18!");
            } else {
                System.out.println("Вам нет 18!");
            }
        } catch (DateTimeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}



