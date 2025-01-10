package lab10_zad5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        String pageURL = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first three digits of the account number: ");
        String prefix = scanner.nextLine();

        try {
            URL url = new URL(pageURL);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(prefix)) {
                    String[] parts = line.split("\t");
                    if (parts.length >= 2) {
                        String bankCode = parts[0].trim();
                        String bankName = parts[1].trim();

                        System.out.println("Bank number: " + bankCode);
                        System.out.println("Bank name: " + bankName);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("no bank for these numbers.");
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
