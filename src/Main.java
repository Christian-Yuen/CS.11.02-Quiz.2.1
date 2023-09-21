
import java.util.Scanner;
/* I have neither given nor received any unauthorised aid on this piece of work */
public class Main {

    public static int add (int numOne,int numTwo){
        return numOne + numTwo;

    }
    public static String greeting (String name){
        return "Bonjour,"+name+"!";
    }

    public static int add (int numOne, int numTwo, int numThree, int numFour){
        int x = add(numOne,numTwo);
        int y = add(numThree, numFour);
        return add(x,y);
    }
    public static String printMe(String tobePrinted){

        return tobePrinted;
    }

    public static void main (String[]args){
        int one;
        int two;
        int three;
        int four;
        String name;
        String input;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer");
        one = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter another integer");
        two = scanner1.nextInt();
        int resultOne = add(one,two);
        System.out.println(resultOne);


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter a integer");
        one = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter a integer");
        two = scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter a integer");
        three = scanner4.nextInt();
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Enter a integer");
        four = scanner5.nextInt();
        int resultTwo = add(one,two,three,four);
        System.out.println(resultTwo);

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Enter your name");
        name = scanner6.next();
        String resultThree = greeting(name);
        System.out.println(resultThree);

        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Enter anything");
        input = scanner7.next();
        String resultFour = printMe(input);
        System.out.println(resultFour);

    }

}
