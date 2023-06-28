public class Excercise2 {
    public static void main(String[] args) {
        for (int outerloop = 0; outerloop < 6; outerloop++){
            for(int innerloop = 0; innerloop < outerloop; innerloop++){
                System.out.print(outerloop);
            }
            System.out.println();
        }
    }
}
