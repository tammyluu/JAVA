package JavaCore;

public class VarFunc {
    public static void main(String[] args) {
        playWithIntegers();
        playWithVariables();
        playWithDouble();
        playWithCharacters();
    }

    public static void playWithVariables() {
        int age = 20; // int = 12 bytes in ram
        int a = 10, b;
        b = 100;
        System.out.println("age :" + age);
        int yearOfBirth = 2001;
        age = 2023 - yearOfBirth;
        System.out.println(" your age  is : " + age);
        System.out.println("  age by using transitive technical : " + (2023 - yearOfBirth));
    }

    public static void playWithIntegers() {
        int n = 39;
        System.out.println("n : " + n);
    }

    // Java priorise double than Float
    public static void playWithDouble() {
        double pi = 3.14;
        System.out.println("pi : " + pi);
    }

    public static void playWithCharacters() {
        // 2 bytes for type character , saved by Unicode
        char m = '$';
        System.out.println("unit : " + m);
        //object data type
        String name = "Toto Tata";
        System.out.println("My name is : " + name);
        System.out.println("My 1st letter of name is : " + name.charAt(0));
        System.out.println("My name is a lowercase is  : " + name.toLowerCase());
    }
    public static void  playWithBooleans(){
        boolean marriedStatus = false; //1bit : true /false
        if(mamarriedStatus == true)
        System.out.println("You're married with");
        else
            System.out.println("you'");
    }
}
