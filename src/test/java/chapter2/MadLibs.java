package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
       // 1. ask the user for a season of the year
        System.out.println("Please enter a season of the year");
        Scanner scanner= new Scanner(System.in);
        String season = scanner.next();


        //2. ask the user for a whole number
        System.out.println("Cups of coffee");
        int Cups = scanner.nextInt();

        //3. ask the user for an adjective
        System.out.println("Please add an adjective");
        String adjective = scanner.next();

        //4. output
        System.out.println("On a " + adjective + season + " day, I drink a minimum of " + Cups + " cups of coffe.");
    }
}
