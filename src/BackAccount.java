public class BackAccount {
    private double amount;
    public void deposit (double sum){
        amount += sum ;
        System.out.println("Вы внесли счет: " + sum);
    }
    public void withdraw(int sum) throws LimitExeption {
        if (sum > amount) {
            throw new LimitExeption("Ошибка, у вас недостаточно средств", amount);
        } else {
            System.out.println("Вы можете снять сумму со счета: " + sum);
            amount -= sum;
            System.out.println("Вы сняли сумму: " + sum);
        }
    }

    public double getAmount() {
        return amount;
    }
}
