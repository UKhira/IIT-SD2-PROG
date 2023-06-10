import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        Scanner monthInput = new Scanner(System.in);
        System.out.println("Enter a month name: ");
        String month = monthInput.next();

        int days = 0;
        switch (month) {
            case "January":  days = 31; break;
            case "February": days = 28; break;
            case "March" : days = 31; break;
            case "April" : days = 30; break;
            case "May" : days = 31; break;
            case "June" : days = 30; break;
            case "July" :  days = 31; break;
            case "August" : days = 31; break;
            case "September" :  days = 30; break;
            case "October" : days = 31; break;
            case "November" : days = 30; break;
            case "December" : days = 31; break;
        }
        System.out.println(days);
    }
}
