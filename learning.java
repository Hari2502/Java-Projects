import org.w3c.dom.ls.LSOutput;
import javax.swing.JOptionPane;

import java.util.Scanner;

public class learning {


    public static void main(String[] args) {

        JOptionPane.showInputDialog("hello");

        // Scanner no need to change it
        Scanner ConsoleReader = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = ConsoleReader.nextLine();

        System.out.println("enter an adjective: ");
        String adjective = ConsoleReader.nextLine();

        System.out.println("How many flying bisons do you want?");
        Integer bison = ConsoleReader.nextInt();


        System.out.println("");

        System.out.println("Fire, Water, Earth, Air... Long ago there was an Airbender by the name of " + name);
        System.out.println("He was training to be able to fly at the Southern Air Temple but he was very " + adjective);
        System.out.println("Though he was " + adjective + " He was determined to pass his last test.");
        System.out.println("His last test was supposed to be finding enough cabbages to feed the bison.");

        if (bison >= 3 && bison <=5) {
            System.out.println("In order to feed the " + bison +  " bison he needs " + 2*bison + " cabbages ");

        } else if (bison <= 3) {
            System.out.println("In order to feed the" + bison + "he needs" + bison + "cabbages");
        } else {
            System.out.println("You have too many bison");
        }



    } // end main
} // end class learning

