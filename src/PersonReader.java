import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonReader {
    public static void main(String[] args) throws IOException {
        //counter
        Scanner fileScanner = null;
        File selectedFile = null;

        ArrayList<Person> personsData = new ArrayList<Person>();

        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            selectedFile = chooser.getSelectedFile();
            fileScanner = new Scanner(selectedFile);
        }


        System.out.println("Lastname    ID   Firstname  Title    YOB");
        System.out.println("============================================");

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                String word = lineScanner.next();
                String[] wordArray = word.split(",");
                for (String i:wordArray) {
                    System.out.print(i + "   ");
                }

            }
            System.out.print("\n");

            lineScanner.close();
        }
        fileScanner.close();
    }
}
