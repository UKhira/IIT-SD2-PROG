import java.util.Scanner;

public class Excercise2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            for(int asterisk = 0; asterisk < 10; asterisk++){
            System.out.print("*");
        }
        System.out.println("\n   Menu");
        for(int asterisk = 0; asterisk < 10; asterisk++){
            System.out.print("*");
        }
        System.out.println("\n1.- Addition \n2.- Substraction \n0.- Quit \nPlease select an option");
        String option = in.next();

        if (option.equals("1") || option.equals("2")) {
            getNumbers(option);
        }
        else if (option.equals("0")){
            break;
        }
        else {
            System.out.println("Invalid input");
        }
    }
        
    }

    private static void getNumbers(String option){
        System.out.println("Enter a number");
        double num1 = in.nextDouble();
        System.out.println("Enter anothr number");
        double num2 = in.nextDouble();
        
        switch(option) {
            case "1" : System.out.println("Answer = "  + addition(num1,num2) ); break;
            case "2" : System.out.println("Answer = " + substraction(num1,num2) ); break;
        }
    }

    private static double addition(double num1, double num2){
        double answer = num1 + num2;
        return answer;
    }

    private static double substraction(double num1, double num2){
        double answer = num1 - num2;
        return answer;
    }
}
