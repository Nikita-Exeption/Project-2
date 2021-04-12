package org.Nikita;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public final static int AGE_OF_MAJORITY = 18;

    public static void main(String[] args) {
        LocalDate birthday = getUserBirthday();
        if (isAdult(birthday)) ;


    }

    private static boolean isAdult(LocalDate birthday) {
        Period fullAge = Period.between(birthday, LocalDate.now());
        if (fullAge.getYears() >= AGE_OF_MAJORITY) {
            System.out.println("Вам есть 18! Ура");
            return true;
        } else {
            System.out.println("Вам нет 18 :(");
            return false;
        }
    }

    private static LocalDate getUserBirthday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число рождения:");
        int dayOfMonth = scanner.nextInt();
        System.out.println("Введите месяць рождения:");
        int month = scanner.nextInt();
        System.out.println("Введите год рождения:");
        int years = scanner.nextInt();
        LocalDate birthday = LocalDate.of(years, month, dayOfMonth);
        return birthday;
    }

}
