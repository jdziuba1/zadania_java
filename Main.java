package zad3;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("Jan Kowalski", 4666, "123456789");

        try {

            account.transfer(4700);
        } catch (NotEnoughMoneyException e) {

            System.out.println("Caught NotEnoughMoneyException: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("Caught an unexpected exception: " + e.getMessage());
        } finally {

            System.out.println("Current account balance: " + account.getBalance());
        }
    }
}
