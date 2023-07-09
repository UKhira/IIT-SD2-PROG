public class Main {
    
    /*
     * In your main, create a new student and print their name
    */

    public static void main(String[] args) {
        
        Student student1 = new Student("Alex","W1234");
        System.out.printf("Name = %s %nID = %s %n", student1.getName(), student1.getID());

        Module module1 = new Module("w190", 20, 40);
        System.out.print(module1.code + " ");
        module1.status();

    }
}
