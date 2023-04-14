package bank.application;

public interface BankInterface {

    public int checkBalance(String password);

    public String addMoney(int money);

    public String withDrawMoney(int money, String password);

    public String changePassword(String oldPassword, String newPassword);

    public double calculateTotalInterest(int years);



    /*
    //TODO: we will try to transfer money within the same bank
     */
}
