package bank.application;

public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest = 7;
        HdfcBank.rateOfInterest = 6;

        SBI account1 = new SBI(100000, "123", "Ujjwal");

        SBI account2 = new SBI(150000, "456", "Ashu");

        HdfcBank account3 = new HdfcBank(150000, "789", "Harsh");

        int balance = account1.checkBalance("124");
        System.out.println("balance for account1 is " + balance);

        int balanceCheck = account1.checkBalance("123");
        System.out.println("Balance for account1 is " + balanceCheck);

        String bankMsg = account2.addMoney(50000);
        System.out.println(bankMsg);


        String withdraw = account2.withDrawMoney(50000, "456");
        System.out.println(withdraw);

        String message = account3.withDrawMoney(50000, "1234");
        System.out.println(message);

        String message1 = account3.withDrawMoney(50000, "789");
        System.out.println(message1);

        double interest = account1.calculateTotalInterest(20);
        System.out.println("Total interest you will get " + interest);


        double interest1 = account3.calculateTotalInterest(20);
        System.out.println("Total interest you will get " + interest1);
    }
}