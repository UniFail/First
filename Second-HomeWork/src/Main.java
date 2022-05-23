import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //First task
        byte ClientOS = 1;
        if (ClientOS == 0) {
            System.out.println("Download app for Android");
        }
        if (ClientOS == 1) {
            System.out.println("Download app for IOS");
        }

        //SecondTask

        int clientDeviceYear = 2015;
        if (ClientOS == 0)  {
           if (clientDeviceYear >= 2015)
               System.out.println("Download app for Android");
           else {
                System.out.println("Download easy for Android");
            }
        }
        if (ClientOS == 1) {
            if (clientDeviceYear >= 2015)
                System.out.println("Download app for IOS");
            else {
                System.out.println("Download easy for IOS");
            }

        }
        //Third
        int Year = 2025;
        boolean IsLeapYear = (Year % 4 == 0) && (Year % 100 != 0);
        if (IsLeapYear) {
            System.out.println(Year +  " is leap year ");
        }
        else {
            System.out.println(Year + " is not leap year " );
        }

        //Fourth
        float deliveryDistance = 19;
        if (deliveryDistance < 20) {
            System.out.println("We will deliver it in 1 day");
        }
        if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            System.out.println("We will deliver it in 2 days");
        }

        if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            System.out.println("We will deliver it in 3 days");
        }

        //Fifth
        int monthNumber = 1;
         switch (monthNumber) {
             case 1: System.out.println("Winter");
                 break;
             case 2: System.out.println("Winter");
                 break;
             case 3: System.out.println("Spring");
                 break;
             case 4: System.out.println("Spring");
                 break;
             case 5: System.out.println("Spring");
                 break;
             case 6: System.out.println("Summer");
                 break;
             case 7: System.out.println("Summer");
                 break;
             case 8: System.out.println("Summer");
                 break;
             case 9: System.out.println("Autumn");
                 break;
             case 10: System.out.println("Autumn");
                 break;
             case 11: System.out.println("Autumn");
                 break;
             case 12: System.out.println("Winter");
                 break;
             default:
                 System.out.println("Opp, it not month");

        }






    }

}