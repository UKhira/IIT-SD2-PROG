import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        int [] array = new int [10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int element = 0 ; element < array.length; element++){
            array[element] = input.nextInt();
        }
        
        for(int el: array){
            System.out.print(" " + el);
        }
        for(int el: array){
           if (el <= 40){
            sout
           }
        }
        input.close(); 
    }
}
