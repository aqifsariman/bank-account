package bankAccount;

public class FixedDepositAcount extends BankAccount {
    private static final Exception IllegalArgumentException = null;
    private float interest = 0.03f;
    private int durationInMonths = 6;

    public FixedDepositAcount(String name, float balance) {
        super(name, balance);
    }

    public FixedDepositAcount(String name, float balance, float interest) {
        super(name, balance);
        this.interest = interest;
    }

    public FixedDepositAcount(String name, float balance, float interest, int durationInMonths) throws Exception {
        super(name, balance);
        boolean changed = false;
        if (!changed) {
            this.interest = interest;
            this.durationInMonths = durationInMonths;
            changed = true;
        } else {
            throw IllegalArgumentException;
        }
    }

    @Override
    public void withdraw(float balance) {
    }

    @Override
    public void deposit(float balance) {
    }

    @Override
    public float getBalance() {
        return super.balance * (1 + this.interest);
    }

}
