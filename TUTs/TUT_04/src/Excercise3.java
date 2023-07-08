public class Excercise3 {
    public static void main(String[] args) {
        int A [] = {2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Even Numbers");
        for(int elements : A) {
            if (elements % 2 == 0){
                System.out.print(elements + " ");
            }
        }
        System.out.println();
        for(int elements : A) {
            for(int multiply :A){
                if(elements * 2 == multiply){
                    System.out.print(elements + " ");
                }
            }
        }
    }
}

/**
 * Given the set (array) A = {2, 3, 4, 5, 6, 7, 8, 9} find all elements of set A that are:
 * a) Even numbers
 * b) Those numbers that being multiplied by 2 give a number that is also anelement of A.
 * 
 * Write a Java program that calculates and prints the solution of the previous two tasks.Note: 
 * To find if a number is even or odd, you can calculate the remainder of a divisionby using the operator %. 
 * An even number is a number that is divisible by 2 andgenerates a reminder of 0
 */
