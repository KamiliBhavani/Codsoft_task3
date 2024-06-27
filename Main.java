public class Main {
    public static void main(String[] args) {
        BankDetails account = new BankDetails(1000); // Initial balance
        ATM1 atm = new ATM1(account);
        atm.showMenu();
    }
}
