/**
 * This program will output the total of 1 - 10
 */
class whileLoop{
    public static void main(String[] args) {
        int start = 1, count = 0;
        while (start < 11){
            count = count + start;
            start++;
        }
        System.out.println(count);
    }
}