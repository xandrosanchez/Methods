public class Main {

    public static void searchLeapYear(int year){
        if (year % 4 == 0){
            System.out.println(year + " - високосный год");
        }
        else{
            System.out.println(year + " - не високосный год");
        }
    }

    public static void optimizationPhone(int OS, int year_of_issue){
        if (year_of_issue < 2016){
            if (OS == 0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else if (OS == 1){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void searchDeliveryTime(int deliveryDistance){
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: 1");
        }
        else{
            System.out.println("Потребуется дней: " + (((deliveryDistance - 20)/40)+2));
        }
    }



    public static void main(String[] args) {
        searchLeapYear(2000);
        optimizationPhone(1,2005);
        int deliveryDistance = 95;
        searchDeliveryTime(deliveryDistance);

    }
}