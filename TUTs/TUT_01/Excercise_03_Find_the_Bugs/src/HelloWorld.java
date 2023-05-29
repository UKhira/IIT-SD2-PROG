/*
public class HelloWorld
public static void main(String[] args) {
String name = "John"
String name = "Brown";
System.out.println("Hello " + name +"" + name + "");
}
}

This is a debugged code in here there are errors

1. missing "{" at the end of HelloWorld
2. declared same variable twice

debugged code should be like ,
*/

public class HelloWorld {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Brown";

        System.out.println("Hello " + firstName + " " + lastName);
    }
}