public class Excercise3 {
    public static void main(String[] args) {
        for (int outerloop = 0; outerloop < 9; outerloop += 2){
            for(int innerloop = 0; innerloop < outerloop *2; innerloop += 2){
                System.out.print(outerloop);
            }
            System.out.println();
        }
    }
}
