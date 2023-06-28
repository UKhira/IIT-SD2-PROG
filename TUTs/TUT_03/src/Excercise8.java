public class Excercise8 {
    public static void main(String[] args) {
        int mod, div, div2, mod2;
        for (int num = 1; num <= 500; num++) {
            // System.out.println(num);
            if(num < 10) {
                if (num * num * num == num){
                    System.out.println(num);
                }
            }
            else if (num < 100) {
                mod = num % 10;
                div = num / 10;
                if( (div * div * div) + (mod * mod * div) == num) {
                    System.out.println(num);
                }
            }
            else {
                mod = num % 100;
                div = num / 100;
                div2 = mod / 10;
                mod2 = mod % 10;
                if ( (div * div * div )   + ( div2 * div2 * div2 )   + (mod2 * mod2 * mod2) == num) {
                    System.out.println(num); 
                }
            }
        }
    }
}
