/*Перевод дс со счета на счет*/

public class TransferAction {
    private double transactionAmount;

    public TransferAction(double amount) {
        if (amount > 0) {
            this.transactionAmount = amount;
        } else {
            throw new IllegalArgumentException();//или собств исключение
        }

    }
}
