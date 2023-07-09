import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SS6 {
    public static void main(String[] args) {
    
        Integer[] myNamesArray = new Integer[10];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < myNamesArray.length; i++) {
            myNamesArray[i] = input.nextInt();
        }

        ArrayList<Integer> myNamesArrayList = new ArrayList<>(Arrays.asList(myNamesArray));

        Collections.sort(myNamesArrayList);

        System.out.println("Sorted ArrayList: " + myNamesArrayList);

        input.close();
    }
}

/**
 * Write a program to get 10 Integers from the user and store them in an arraycalled myNamesArray. 
 * then clone the Integers in the myNames into an ArrayListcalled myNamesArrayList. 
 * Sort the myNamesArrayList using the sort method.
 */
