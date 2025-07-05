public class BankAccount_Test {
    public static void main(String[] args){

        BankAccount account_001 = new BankAccount("Minibaeva_E_R");
        BankAccount account_002 = new BankAccount("Minibaev_R_R");
        //Проверка начальных значений
        System.out.println("Начальные значения:");
        System.out.println(account_001.getOwner_name());
        System.out.println(account_001.getOpening_date());
        System.out.println(account_001.getBalance());
        System.out.println(account_001.getIs_blocked());

        //Проверка пополнения
        System.out.println("Пополнение 10000:" + account_001.deposit(10000));
        System.out.println("Баланс:" + account_001.getBalance());

        //Проверка снятия
        System.out.println("Снятие 1:" + account_001.withdraw(1));
        System.out.println("Баланс:" + account_001.getBalance());

        //Проверка перевода
        System.out.println("Перевод 999" + account_001.transfer(account_002,999));
        System.out.println("Баланс " +account_001.getOwner_name() + ":" + account_001.getBalance());
        System.out.println("Баланс " +account_002.getOwner_name() + ":" + account_002.getBalance());

        //Проверка невозможности снять больше, чем есть
        System.out.println("Снятие 600: " + account_001.withdraw(600));
        System.out.println("Баланс: " + account_001.getBalance());

        //Проверка невозможности перевода с заблокированного счёта
        account_001.setBlocked(true);
        System.out.println("Перевод с заблокированного счета: " + account_001.transfer(account_002, 1));
    }
}
