package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int number_discipline = 1; number_discipline < 14; number_discipline++) {
            discipline_complexity();
            Scanner in = new Scanner((System.in));
            System.out.println("Все правильно? (yes/no):  \n\t");
            String yes_or_no =in.nextLine();
            switch (yes_or_no){
                case "yes":
                    System.out.println("Далее....\n\t");
                    break;
                case "no":
                    System.out.println("Все заново...\n\t");
                    number_discipline = number_discipline;

            }
        }

    }
    static void discipline_complexity(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дисциплину: ");
        String  discipline = in.nextLine();
        System.out.print("Введите сложность дисциплины по 20 бальной шкале: ");
        int coefficient = in.nextInt();
        System.out.println("******************* \n");
        System.out.printf("Дисциплина называется: %s \n", discipline);
        System.out.printf("Сложность дисциплины по 20 бальной шкале = %d \n", coefficient);

    }
}
