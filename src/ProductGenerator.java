import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductGenerator
{
    public static void main(String[] args)
    {
        String name = "";
        String description = "";
        String ID = "";
        double cost = 0;


        boolean done = false;

        ArrayList<Product> productsData = new ArrayList<Product>();
        Scanner in = new Scanner(System.in);

        do {
            name = SafeInput.getNonZeroLenString(in, "What is the name");
            description = SafeInput.getNonZeroLenString(in, "What is the description");
            ID = SafeInput.getRegExString(in, "Enter a 6-digit id", "" + "\\d{6}");
            cost = SafeInput.getDouble(in, "What is the cost");

            done = SafeInput.getYNConfirm(in, "Are you done entering prompts?");

            productsData.add(new Product(name, description, ID, cost));
        } while(!done);

        try {
            FileWriter myWriter = new FileWriter("ProuctsDataFile.txt");
            for(int i = 0; i < productsData.size(); i++) {
                myWriter.write(productsData.get(i).toCVSRecord());
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
