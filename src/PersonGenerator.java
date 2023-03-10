import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator
{
    public static void main(String[] args)
    {
        String firstName = "";
        String lastName = "";
        String ID = "";
        String title = "";
        int yearOfBirth = 0;


        boolean done = false;

        ArrayList<Person> personsData = new ArrayList<Person>();
        Scanner in = new Scanner(System.in);

        do {
            ID = SafeInput.getRegExString(in, "Enter a 6-digit id", "" + "\\d{6}");
            firstName = SafeInput.getNonZeroLenString(in, "What is your first name");
            lastName = SafeInput.getNonZeroLenString(in, "What is your last name");
            title = SafeInput.getNonZeroLenString(in, "What is your title");
            yearOfBirth = SafeInput.getInt(in, "What is your birth year");

            done = SafeInput.getYNConfirm(in, "Are you done entering prompts?");

            personsData.add(new Person(ID, firstName, lastName, title, yearOfBirth));
        } while(!done);

        try {
            FileWriter myWriter = new FileWriter("PersonsDataFile.txt");
            for(int i = 0; i < personsData.size(); i++) {
                myWriter.write(personsData.get(i).toCVSRecord());
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
