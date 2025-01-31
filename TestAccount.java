public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts
        Account acc1 = new Account("Acc1", "John Doe", 5000);
        Account acc2 = new Account("Acc2", "Jane Doe", 4000);

        // Display initial balances using toString() and printf()
        System.out.printf("Initial Balances:%n%s%n%s%n", acc1, acc2);

        // Transfer $1000 from Acc1 to Acc2
        acc1.transferTo(acc2, 1000);

        // Display balances after transfer
        System.out.printf("%nBalances after transfer:%n%s%n%s%n", acc1, acc2);

        // Testing credit (depositing $500 into Acc1)
        acc1.credit(500);
        System.out.printf("%nAfter crediting $500 to Acc1:%n%s%n", acc1);

        // Testing debit (withdrawing $2000 from Acc2)
        acc2.debit(2000);
        System.out.printf("%nAfter debiting $2000 from Acc2:%n%s%n", acc2);

        // Testing debit with insufficient balance (Acc2 tries to withdraw $5000)
        acc2.debit(5000);
    }
}
