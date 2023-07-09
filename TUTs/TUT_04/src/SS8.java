import java.util.ArrayList;
import java.util.Scanner;
public class SS8 {
    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> sub1 = new ArrayList<>();
        ArrayList<Integer> sub2 = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();


        for(int i : arr){
            for(int j = 0; j < arr.length; j++){
                if(arr[j] + i == num){
                    sub1.add(i);
                    sub2.add(arr[j]);
                }
            }
        }

        for(int i = 0; i < sub1.size(); i++){
            for(int j = 0; j < sub2.size(); j++){
                if(sub1.get(i) == sub2.get(j)){
                    sub1.remove(j);
                    sub2.remove(j);
                }
            }
        }        

        System.out.println(sub1 + " " + sub2);

        in.close();
    }    
}

/**
 * How do you find all pairs whose sum is equal to a given number from an integerarray in Java? 
 * You have given an array of int primitives and a number, you need tofind all pairs in an array whose sum is 
 * equal to given number e.g. if an array is {1, 2,3, 4, 5} and given sum is 6 then your program should return 
 * {2, 4} and {1, 5}.
*/
