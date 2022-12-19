public class BackAccount {
    private double amount;
    public void deposit (double sum){
        amount += sum ;
        System.out.println("�� ������ ����: " + sum);
    }
    public void withdraw(int sum) throws LimitExeption {
        if (sum > amount) {
            throw new LimitExeption("������, � ��� ������������ �������", amount);
        } else {
            System.out.println("�� ������ ����� ����� �� �����: " + sum);
            amount -= sum;
            System.out.println("�� ����� �����: " + sum);
        }
    }

    public double getAmount() {
        return amount;
    }
}
