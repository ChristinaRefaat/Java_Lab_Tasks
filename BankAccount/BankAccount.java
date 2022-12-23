
class BankAccount {

    int balance, Ammount;
    String customerName;
    String customerId;
    int preiviousTrannsaction;

    public BankAccount(String custId, String custName) {
        custName = customerName;
        custId = customerId;
    }

    void Diposite(int ammount) {
        Ammount = ammount;
        if (ammount > 0) {
            balance += ammount;
            preiviousTrannsaction = ammount;
            System.out.println("Your Balance = " + balance);
        }
    }

    void WithDraw(int ammount) {
        Ammount = ammount;
        if (balance > 0 && balance >= ammount) {
            balance -= ammount;
            preiviousTrannsaction = ammount;
            System.out.println("Your Balance = " + balance);
        }
    }

    void preiviousTrannsaction() {
        if (preiviousTrannsaction > 0) {
            preiviousTrannsaction = Ammount;
        } else {
            preiviousTrannsaction = Math.abs(Ammount);
        }
        System.out.println("The Preivious Trannsaction = " + preiviousTrannsaction);
    }
}
