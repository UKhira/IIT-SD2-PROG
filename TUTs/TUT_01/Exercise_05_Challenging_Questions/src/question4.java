import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        final double MANUAL_EARN = 500.00;
        final double SKILLED_EARN = 700.00;
        final double MANAGEMENT_EARN = 800.00;
        final double TAX = 0.2;
        
        Scanner countInputs = new Scanner(System.in);

        System.out.println("Enter how many manuals are there in company: ");
        int manualCount = countInputs.nextInt();
        
        System.out.println("Enter how many skilled are there in company: ");
        int skilledCount = countInputs.nextInt();

        System.out.println("Enter how many management are there in company");
        int managementCount = countInputs.nextInt();

        double wageBill = (MANUAL_EARN * manualCount) + (SKILLED_EARN * skilledCount) + (MANAGEMENT_EARN * managementCount);
        System.out.printf("Total wage bill = £%.2f", wageBill);

        double approxTax = wageBill * TAX;
        System.out.printf("\nApproximate Tax = £%.2f", approxTax);
    }
}
