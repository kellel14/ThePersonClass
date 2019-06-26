import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        String addPeople = "";

        do {
            Person thePerson = new Person();
            Random rand = new Random();

            Scanner userInput = new Scanner(System.in);

            System.out.println("Enter your name.");
            String personName = userInput.nextLine();
            thePerson.setName(personName);

            System.out.println("Enter your email.");
            String personEmail = userInput.nextLine();
            thePerson.setEmail(personEmail);

            System.out.println("What is your favourite colour?");
            String personColour = userInput.nextLine();
            thePerson.setFavouriteColor(personColour);
            String message = thePerson.getDisplayText();

            System.out.println(message);

            //add another person
            System.out.println("Do you want to add another person?" + "\n(yes/no)");
            addPeople = userInput.nextLine();


        } while (addPeople.equalsIgnoreCase("yes"));
    }
}