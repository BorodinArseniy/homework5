import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
            //task1
        byte clientOS = 1;
        /* if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } */

            //task2

        int yearRelease = 2015;

        if (clientOS == 0 && yearRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS ==0 && yearRelease >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

            //task3
        int year = 1900;
        if (year%4==0) {
            if (year%100==0 && year%400!=0) {
                System.out.printf("%d год не является високосным", year);
            } else if (year%400==0){
                System.out.printf("%d год является високосным", year);
            } else {
                System.out.printf("%d год является високосным", year);
            }
        } else {
            System.out.printf("%d год не является високосным", year);
        }
        System.out.println();

            //task4
        int deliveryDistance = 95;
        if (deliveryDistance<20) {
            int deliveryDays = 1;
            System.out.println("Потребуется дней " + deliveryDays);
        } else if (deliveryDistance < 60) {
            int deliveryDays = 2;
            System.out.println("Потребуется дней " + deliveryDays);
        } else if (deliveryDistance < 100) {
            int deliveryDays = 3;
            System.out.println("Потребуется дней " + deliveryDays);
        }

            //task5
        int monthNumber = 12;

        switch(monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Ферваль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца нет");
        }



    }
}