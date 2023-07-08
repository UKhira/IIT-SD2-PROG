import java.lang.Math;
public class Excercise6 {
    public static void main(String[] args) {
        int rolls [][] = new int [1000][2];
        int x = 0, y = 0, xAndy = 0;
        int roll = 1;
        while (roll <= 1000){
            int currentValueOfFirstRoll = (int) (Math.random() * 6 + 1);
            rolls[roll - 1][0] = currentValueOfFirstRoll;
            if(currentValueOfFirstRoll == 4){
                x++;
            }

            int currentValueOfSecondRoll = (int) (Math.random() * 6 + 1);
            rolls[roll-1][1] = currentValueOfSecondRoll;
            if(currentValueOfFirstRoll == 4){
                y++;
            }

            if(rolls[roll - 1][0] == 4 && rolls[roll-1][1] == 4){
                xAndy++;
            }
            roll++;
        }

        System.out.println("Results");
        int i = 1;
        for(int [] el: rolls){
            System.out.print("Roll No." + i);
            i++;
            for(int val: el){
                System.out.print(" " + val+ " ");
            }
            System.out.println();
        }
        System.out.println("Probability that X = 4 is " + x + " out of 1000");
        System.out.println("Probability that Y = 4 is " + y + " out of 1000");
        System.out.println("Probability that X= 4 and Y = 4 is " + xAndy + " out of 2000");
    }   
}

/**
 * A fair die is rolled twice and we get two numbers 
 * X = result of the first roll and 
 * Y =result of the second roll.
  
 * a) What is the probability that X = 4?
 * b) What is the probability that Y = 4?
 * c) What is the probability that both X = 4 and Y = 4?
  
 * Write a program in Java that simulates this scenario 1,000 times 
 * (you roll two dice1,000 times) and estimates the probabilities. How good is your simulation? Is it anybetter 
 * if you increase the number of simulations to 1,000,000?
 * Note: You can use the Java class Random to generate random numbers (you will needto import java.util.Random. 
 * You can then create a generator: Random generator = newRandom();
 */