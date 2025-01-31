public class Account {
    private String id;
    private String name;
    private int balance;


    // Constructor with constraints
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter methods
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Credit amount to balance
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Debit amount from balance
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Transfer amount to another account
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // toString method
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
