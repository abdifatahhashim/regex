package exception;


import java.util.regex.*;
class Meta {
    public static void main(String[] args) {


        System.out.println(Pattern.matches("\\d", "2")); //true


        System.out.println(Pattern.matches("\\d", "a")); //false


        System.out.println(Pattern.matches("\\D", "a")); //true


        System.out.println(Pattern.matches("\\D", "2")); //false
    }
}


