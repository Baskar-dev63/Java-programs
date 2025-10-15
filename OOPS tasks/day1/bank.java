public class Bank {
    private int accnumber;
    private double balance;
    public double deposit;
    public double withdraw;


    Bank() {
        System.out.println("This is Bank site..");
    }

    Bank(double deposit) {
        this.deposit = deposit;
    }

    int getaccnumber() {
        return this.accnumber;
    }

    void setaccnumber(int accnum) {
        this.accnumber = accnum;
    }

    double getdeposit() {
        return this.deposit;
    }

    void setdeposit(double depo) {
        this.deposit = depo;
    }

    double getbalance() {
        this.balance = this.deposit;
        return this.balance;
    }

    void setwithdraw(double money) {
        if (this.balance > money) {
            this.withdraw = money;
            this.balance = this.balance - this.withdraw;
            getwithdraw();
        } else {
            System.out.println("Balance Insuffficient");
        }

    }

    void getwithdraw() {
        System.out.println("This is your WithdrawalMoney: " + this.withdraw);
        newbalance();
    }

    void newbalance() {
        System.out.println("This is New Balance: " + this.balance);
    }

}
