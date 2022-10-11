import java.time.LocalDate;

public class Main {
    // Задание-1
    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "  — високосный год");
        } else {
            System.out.println(year + "  — не високосный год");
        }
    }


    // Задание-2
    public static void updateVersion(int typeOs, int yearOfIssue){
        if (typeOs != 1 && typeOs != 0){
            throw new IllegalArgumentException ("Такого ОС нет!");
        }
        int currentYear = LocalDate.now().getYear();
        if (yearOfIssue > currentYear) {
            throw new IllegalArgumentException("Такого года выпуска нет!");
        }
        String osString = typeOs == 0 ? "IOS":"Android";
        String versionString = yearOfIssue < 2015 ? "обычную":"облегченную";
        System.out.println("Установите " + versionString + " версию " + osString + " по ссылке ");
    }


    // Задание-3

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) distance / 40) + 1;
        }
    }



    public static void main(String[] args) {

//
        System.out.println("Задание-1");
        leapYear(2022);



        System.out.println("Задание-2");
        updateVersion(1,2016);



        System.out.println("Задание-3");
        int deliveryDays = calculateDeliveryDays(60);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

}