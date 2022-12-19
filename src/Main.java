public class Main {
    public static void main(String[] args) {
        BackAccount backAccount = new BackAccount();
        backAccount.deposit(20000.00);
        while (true){
            try {
                backAccount.withdraw(6000);
            } catch (LimitExeption e){
                try {
                    backAccount.withdraw((int ) e.getRemainingAmount());
                } catch (LimitExeption ex ) {
                    ex.printStackTrace();
                } break;
            }
        }
    }

}