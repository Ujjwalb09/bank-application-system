package bank.application;

import java.util.UUID;

public class HdfcBank implements BankInterface {
    private int balance;
    private String accountNo;
    private String password;
    public String name;
    public static double rateOfInterest;

    //after defining variables I have to define constructor


    public HdfcBank(int balance, String password, String name) {

        this.accountNo = UUID.randomUUID().toString();
        this.balance = balance;
        this.password = password;
        this.name = name;
    }

    @Override
    public int checkBalance(String password) {

        if(password.equals(this.password)){
            return balance;
        }

        return -1;
    }

    @Override
    public String addMoney(int money) {

        balance = balance + money;

        String message = money + "has been added to the account " + accountNo;

        return message;
    }

    @Override
    public String withDrawMoney(int drawMoney, String password) {

        if(password.equals(this.password)){
            if(drawMoney > balance){
                return "Insufficient balance";
            }

            else {
                return "Money withdrawn successfully.";
            }
        }

        else {
            return "Wrong password";
        }
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {

        //this.password means current password for the account
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return "Password has been updated successfully";
        }
        else {
            return "Wrong password";
        }
    }

    @Override
    public double calculateTotalInterest(int years) {

        double interest = balance*rateOfInterest*years/100;

        return interest;

    }
}
