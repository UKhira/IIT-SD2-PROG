import java.util.Scanner;

/**
 * program that reads employee information
iteratively. (Employee name, emp_no, job title )
• Before reading the Employee number, make sure employee number is an
integer number. Otherwise exit from the program with an appropriate error.
 */
public class Emp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter Employee Number: ");
            if(in.hasNextInt()) {
                int no = in.nextInt();
                System.out.print("Enter Employee Name: ");
                String name = in.next();
                System.out.print("Enter Job Title: ");
                String job = in.next();

                System.out.printf("ID: %d %nName: %s %nJob: %s %n", no, name, job);

                System.out.print("Enter \"Y\" to continue \"Q\" to quit: ");
                String response = in.next();
                if(response.equalsIgnoreCase("Y")) {
                    continue;
                }
                else if(response.equalsIgnoreCase("Q")){
                    break;
                }
                else{
                    System.out.println("Invalid Input");
                    continue;
                }
            }
            else {
                System.out.println("Employee number must be an integer");
                break;
            }
        }
        in.close();
    }
}
