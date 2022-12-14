import java.util.Calendar;

public class Main {

    public static void searchLeapYear(int year){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        if (cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365){
            System.out.println(year + " - leap year");
        }
        else{
            System.out.println(year + " - do not leap year");
        }
    }

    public static void optimizationPhone(int OS, int year_of_issue){
        if (year_of_issue < 2016){
            if (OS == 0){
                System.out.println("?????????? ??????????? ?????? ?????????? ??? iOS ?? ??????");
            }
            else if (OS == 1){
                System.out.println("?????????? ??????????? ?????? ?????????? ??? Android ?? ??????");
            }
        }
    }

    public static void searchDeliveryTime(int deliveryDistance){
        if (deliveryDistance <= 20){
            System.out.println("??????????? ????: 1");
        }
        else{
            System.out.println("??????????? ????: " + (((deliveryDistance - 20)/40)+2));
        }
    }



    public static void main(String[] args) {
        searchLeapYear(1700);
        optimizationPhone(1,2005);
        int deliveryDistance = 95;
        searchDeliveryTime(deliveryDistance);

    }
}