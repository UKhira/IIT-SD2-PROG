import java.util.Arrays;

public class SS3 {
    public static void main(String[] args) {
        int [] val = {1, 23, 45, 656, 89, 90};
        int [] shiftVal = new int [val.length];

        shiftVal [0] = val[5];
        for (int i = 0; i < (val.length)-1; i++){
            shiftVal[i+1] = val[i];
        }

        System.out.println(Arrays.toString(shiftVal));
    }
}

/**
 * Write a program that reads in a sequence of ints into an array. The program should then shift each value on 
 * one position in the array. For example, whatever is in array position 4 should be moved into position 5. 
 * Whatever is in the last should be moved to the start. The program should then print out the contents of the 
 * array
 */