package lab10_zad3;

import java.io.*;

public class space {
    public static void main(String[] args) {

        //System.out.println(System.getProperty("user.dir"));
        String FilePath = System.getProperty("user.dir") + File.separator + "text.txt";
        String ToFileFilePath = System.getProperty("user.dir") + File.separator + "ToFileFilePath.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(FilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(ToFileFilePath))) {
            String space;
            while ((space = reader.readLine()) != null) {

                space = space.replace(" ", "-");
                writer.write(space);
                writer.newLine();
            }
            System.out.println("copied successfully");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
